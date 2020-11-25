package SSSPA;
import node.GraphNode;
import java.util.*;
public class SSSPAwithBFS 
{
	ArrayList<GraphNode> nodes=new ArrayList<>();
	
	public SSSPAwithBFS(int noofNodes) 
	{
		for(int i=1; i<=noofNodes; i++)
		{
			nodes.add(new GraphNode("V"+i, i-1));
		}
	}
	
	public void undirectedEdges(int i,int j)
	{
		GraphNode first=nodes.get(i-1);
		GraphNode second=nodes.get(j-1);
		first.neighbours.add(second);
		second.neighbours.add(first);
	}
	
	public void pathPrint(GraphNode node)
	{
		if(node.parent!=null)
		{
			pathPrint(node.parent);
		}
		System.out.print(node.name+"=>");
	}
	
	public void shortestPath(GraphNode node)
	{
		ArrayList<GraphNode> queue=new ArrayList<>();
		queue.add(node);
		while(!queue.isEmpty())
		{
			GraphNode current=queue.remove(0);
			current.isVisited=true;
			System.out.print(current.getName()+": ");
			pathPrint(current);
			System.out.println();
			for(GraphNode neighbour:current.neighbours)
			{
				if(neighbour.isVisited==false)
				{
					queue.add(neighbour);
					neighbour.isVisited=true;
					neighbour.parent=current;
				} 
			}
		}
	}
}
