package SSSPA;
import java.util.*;

public class BellmanFord 
{
	public List<Vertex> verticies;
	public List<Edge> edges;
	
	public BellmanFord(List<Vertex> verticies,List<Edge> edges)
	{
		this.verticies=verticies;
		this.edges=edges;
	}
	
	public void bellmanfordAlgorithm(Vertex source, Vertex target)
	{
		source.distance=0;
		for(int i=0; i<this.verticies.size()-1; i++)                //in belmanford n-1 iterations has to be done.
		{
			for(Edge edge: edges)
			{
				if(edge.starts.distance==Double.MAX_VALUE)
				{
					continue;
				}
				Vertex v=edge.starts;
				Vertex u=edge.ends;
				double newdistance=v.distance+edge.weight;
				if(newdistance<u.distance)
				{
					u.distance=newdistance;
					u.parent=v;
				}
			}
		}
		
		
		for(Edge edge:edges)
		{
			if(edge.starts.distance!=Double.MAX_VALUE)
			{
				if(hasCycle(edge))
				{
					System.out.println("There is a negative Cycle. . . ");
				}
			}
		}
	}
	
	public boolean hasCycle(Edge edge)
	{
		return (edge.starts.distance+edge.weight) < (edge.ends.distance);
	}
	
	public void getShortestPathTo(Vertex targetVertex){
		List<Vertex> path = new ArrayList<>();
 
		for(Vertex vertex=targetVertex;vertex!=null;vertex=vertex.parent){
			path.add(vertex);
		}
 
		Collections.reverse(path);
		for(Vertex v:path)
		{
			System.out.print(v+"=> ");
		}
		System.out.print(": With Distance :"+targetVertex.distance); 
	}
}
