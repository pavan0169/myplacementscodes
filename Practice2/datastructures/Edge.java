package datastructures;
public class Edge 
{
	public int weight;
	public Vertex starts;
	public Vertex ends;
	
	public Edge(int weight, Vertex starts, Vertex ends) 
	{
		this.weight = weight;
		this.starts = starts;
		this.ends = ends;
	}
	
	
}
