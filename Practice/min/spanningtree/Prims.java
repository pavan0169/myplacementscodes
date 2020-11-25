package min.spanningtree;

import java.util.ArrayList;
import java.util.PriorityQueue;


public class Prims {

	ArrayList<WeightedNode> nodeList = new ArrayList<WeightedNode>();

	public Prims(ArrayList<WeightedNode> nodeList) {
		this.nodeList = nodeList;
	}

	
	void prims(WeightedNode node) 
	{
		node.distance=0; 
		PriorityQueue<WeightedNode> queue = new PriorityQueue<>();
		queue.addAll(nodeList);
		while (!queue.isEmpty()) 
		{
			WeightedNode presentNode = queue.remove();
			for (WeightedNode neighbor : presentNode.neighbor) 
			{
				if (queue.contains(neighbor)) 
				{
					if (neighbor.distance > presentNode.weightMap.get(neighbor))
					{
						neighbor.distance=presentNode.weightMap.get(neighbor);
						neighbor.parent=presentNode;
						queue.remove(neighbor);
						queue.add(neighbor);
					}
				}
			}
		}
		
		double cost = 0;
		for (WeightedNode nodeToCheck : nodeList) {
			System.out.println("From :"+nodeToCheck.parent+"  to "+nodeToCheck+" With Distance "+nodeToCheck.distance);
			cost = cost + nodeToCheck.distance;
		}
		
		System.out.println("\nTotal cost of MST: " + cost);
	}//end of method


	// add a weighted undirected edge between two nodes
	public void addEdge(int i, int j, double d) {
		WeightedNode first = nodeList.get(i-1);
		WeightedNode second = nodeList.get(j-1);
		first.neighbor.add(second);
		second.neighbor.add(first);
		first.weightMap.put(second,d);
		second.weightMap.put(first, d);
	}//end of method
}//end of class















/*
public class Prims 
{
	ArrayList<WeightedNode> nodes=new ArrayList<>();
	ArrayList<Edge> edges = new ArrayList<>();
	
	public Prims(ArrayList<WeightedNode> nodes)
	{
		this.nodes=nodes;
	}
	
	public void addEdge(int i, int j, double d) {
		WeightedNode first = nodes.get(i-1);
		WeightedNode second = nodes.get(j-1);
		first.neighbor.add(second);
		second.neighbor.add(first);
		first.weightMap.put(second,d);
		second.weightMap.put(first, d);
	}
	
	public void prims(WeightedNode node)
	{
		node.distance=0;
		PriorityQueue<WeightedNode> queue=new PriorityQueue<>();
		queue.add(node);
		
		while(!queue.isEmpty())
		{
			WeightedNode current=queue.remove();
			for(WeightedNode neighbor:current.neighbor)
			{
				if(neighbor.distance>current.weightMap.get(neighbor))
				{
					neighbor.distance=current.weightMap.get(neighbor);
					neighbor.parent=current;
					queue.remove(neighbor);
					queue.add(neighbor);
				}
			}
		}
		
		double cost=0;
		for (WeightedNode nodeToCheck : nodes) 
		{
			System.out.println("From :"+nodeToCheck.parent+"  to "+nodeToCheck+" With Distance "+nodeToCheck.distance);
			//("Node " + nodeToCheck + ", key: " + nodeToCheck.distance + ", Parent: " + nodeToCheck.parent);
			cost = cost + nodeToCheck.distance;
		}
	}
}
*/