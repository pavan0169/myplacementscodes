package graphs;
import node.GraphNode;
import java.util.*;
public class BFS 
{
	ArrayList<GraphNode> nodes=new ArrayList<>();
	int[][] edges;
	
	public BFS(int noOfNodes)
	{
		for(int i=1; i<=noOfNodes; i++)
		{
			this.nodes.add(new GraphNode("V"+i, i-1 ));
		}
		this.edges=new int[nodes.size()][nodes.size()];
	}
	
	public void undirectedEdge(int i, int j)
	{
		i--;
		j--;
		edges[i][j]=1;
		edges[j][i]=1; 
	}
	
	public void bfs()
	{
		for(GraphNode node: nodes)
		{
			if(node.isVisited==false)
			{
				bfsvisit(node);
			}
		}
	}
	
	public void bfsvisit(GraphNode node)
	{
		LinkedList<GraphNode> queue=new LinkedList<>();
		queue.add(node);
		while(!queue.isEmpty())
		{
			GraphNode current=queue.remove(0);
			current.isVisited=true;
			System.out.print(current.name+" ");
			
			ArrayList<GraphNode> neighbors=getNeighbors(current);
			for(GraphNode neighbor: neighbors)
			{
				if(neighbor.isVisited==false)
				{
					queue.add(neighbor);
					neighbor.isVisited=true;
				}
			}
		}
	}
	
	public ArrayList<GraphNode> getNeighbors(GraphNode node)
	{
		ArrayList<GraphNode> neighbours=new ArrayList<>();
		int nodeindex=node.index;
		for(int i=0; i<edges.length; i++)
		{
			if(edges[nodeindex][i]==1)
			{
				neighbours.add(nodes.get(i)); 
			}
		}
		return neighbours; 
	}
}
