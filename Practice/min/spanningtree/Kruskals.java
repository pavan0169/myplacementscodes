package min.spanningtree;
import java.util.*;
public class Kruskals 
{
	ArrayList<WeightedNode> nodes = new ArrayList<WeightedNode>();
	ArrayList<Edge> edges = new ArrayList<>();
	
	public Kruskals(ArrayList<WeightedNode> nodes) 
	{
		this.nodes = nodes;
	}
	
	public void addEdge(int firstIndex, int secondIndex, double weight) 
	{
		Edge edge = new Edge( weight, nodes.get(firstIndex - 1), nodes.get(secondIndex - 1));
		WeightedNode first = edge.starts;
		WeightedNode second = edge.ends;
		first.neighbor.add(second);
		second.neighbor.add(first);
		first.weightMap.put(second, weight);
		second.weightMap.put(first, weight);
		edges.add(edge);
	}
	
	public void kruskals()
	{
		DisjointSet.makeset(nodes); 
		Collections.sort(edges);
		double cost=0;
		for(Edge edge:edges)
		{
			WeightedNode first=edge.starts;
			WeightedNode second=edge.ends;
			if(!DisjointSet.findset(first).equals(DisjointSet.findset(second)))
			{
				DisjointSet.union(first, second);
				cost=cost+edge.weight;
				System.out.println("Taken " + edge);
			}
		}
		System.out.println("\nTotal cost of MST: " + cost);
	}
}
