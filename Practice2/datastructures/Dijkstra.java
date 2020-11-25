package datastructures;
import java.util.*;

public class Dijkstra 
{
	public void dijkstra(Vertex source)
	{
		PriorityQueue<Vertex> pq=new PriorityQueue<>();
		source.distance=0;
		pq.add(source);
		source.visited=true;
		
		while(!pq.isEmpty())
		{
			Vertex current=pq.poll();
			for(Edge edge: current.edges)
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
	
	public void getShortestPath(Vertex target)
	{
		List<Vertex> path=new ArrayList<>();
		for(Vertex v=target; v!=null; v=v.parent)
		{
			path.add(v);
		}
		Collections.reverse(path);
		for(Vertex ver:path)
		{
			System.out.print(ver+"=>");
		}
		System.out.print(": And the distance is :"+target.distance);
	}
}
