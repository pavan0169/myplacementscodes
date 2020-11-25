package SSSPA;

import java.util.ArrayList;

class Vertex implements Comparable<Vertex>
{
	public String name;
	public ArrayList<Edge> edges;
	public boolean visited;
	public Vertex parent; 
	public double distance=Double.MAX_VALUE;
	
	public Vertex(String name)
	{
		this.name=name;
		this.edges=new ArrayList<>();
	}
	
	public int compareTo(Vertex next)
	{
		return Double.compare(this.distance, next.distance);
	}
	
	public String toString()
	{
		return name;
	}
}

class Edge
{
	public int weight;
	public Vertex starts;
	public Vertex ends;
	
	public Edge(int weight, Vertex starts, Vertex ends)
	{
		this.weight=weight;
		this.starts=starts;
		this.ends=ends;
	}
}


