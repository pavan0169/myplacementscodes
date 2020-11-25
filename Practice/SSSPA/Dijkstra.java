package SSSPA;
import java.util.*;


public class Dijkstra 
{	
	public void dijkstraMethod(Vertex source)
	{
		PriorityQueue<Vertex> pq=new PriorityQueue<>();
		source.distance=0;
		pq.add(source);
		source.visited=true;
		
		while(!pq.isEmpty())
		{
			Vertex current=pq.poll();
			for(Edge edge:current.edges)
			{
				Vertex v=edge.ends;
				if(v.visited==false)
				{
					double newdistance=current.distance+edge.weight;
					if(newdistance<v.distance)
					{
						pq.remove(v);
						v.distance=newdistance;
						v.parent=current;
						pq.add(v);
					}
				}
			}
			current.visited=true;
		}
	}
	
	public void pathPrint(Vertex node)
	{
		if(node.parent!=null)
		{
			pathPrint(node.parent);
		}
		System.out.print(node.name+"=>");
	}

	public void getShortestPathTo(Vertex targetVertex){
		List<Vertex> path = new ArrayList<>();
 
		for(Vertex vertex=targetVertex; vertex!=null;vertex=vertex.parent)
		{
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
