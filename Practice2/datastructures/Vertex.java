package datastructures;
import java.util.*;
public class Vertex implements Comparable<Vertex>
{
	public String name;
	public int index;
	public ArrayList<Edge> edges;
	public boolean visited;
	public double distance=Double.MAX_VALUE;
	public Vertex parent;
	
	public Vertex(String name)
	{
		this.name=name;
		this.edges=new ArrayList<>();
	}
	
	public String toString()
	{
		return name;
	}
	public int compareTo(Vertex o) 
	{
		return Double.compare(this.distance,o.distance);
	}	
}
