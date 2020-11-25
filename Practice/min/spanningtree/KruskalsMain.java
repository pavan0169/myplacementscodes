package min.spanningtree;
import java.util.*;
public class KruskalsMain 
{
	public static void main(String[] args)
	{
		ArrayList<WeightedNode> nodes=new ArrayList<>();
		for(int i=0;i<7; i++) 
		{
			nodes.add(new WeightedNode(""+(char)(65+i)));
		}
		
		Kruskals graph = new Kruskals(nodes);
		graph.addEdge(1,2,10);
		graph.addEdge(1,2,5);
		graph.addEdge(1,3,3);
		graph.addEdge(1,6,7);
		graph.addEdge(2,3,6);
		graph.addEdge(2,4,2);
		graph.addEdge(2,5,4);
		graph.addEdge(3,6,8);
		graph.addEdge(3,4,3);
		graph.addEdge(4,5,2);
		graph.addEdge(5,5,1);
		
		System.out.println("Running Kruskal's Algo on the graph: ");
		graph.kruskals();
	}
}
