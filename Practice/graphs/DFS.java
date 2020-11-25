package graphs;

import java.util.*;

class GraphNode 
{
	public String name;
	public int index;
	public ArrayList<GraphNode> neighbours =new ArrayList<>();
	public boolean isVisited=false;
	public GraphNode parent;
	
	public GraphNode(String name, int index)
	{
		this.name=name;
		this.index=index;
	}
}



public class DFS
{
	ArrayList<GraphNode> nodes=new ArrayList<>();
	
	public DFS(int noofNodes)
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
	
	public void dfs()
	{
		for(GraphNode node: nodes)
		{
			if(node.isVisited==false)
			{
				visitNode(node);
			}
		}
	}
	
	public void visitNode(GraphNode node)
	{
		Stack<GraphNode> queue=new Stack<>();
		queue.push(node);
		while(!queue.isEmpty())
		{
			GraphNode current=queue.pop();
			current.isVisited=true;
			System.out.print(current.name+" ");
			for(GraphNode neighbour:current.neighbours)
			{
				if(neighbour.isVisited==false)
				{
					queue.push(neighbour);
					neighbour.isVisited=true;
				}
			}
		}
	}
}
