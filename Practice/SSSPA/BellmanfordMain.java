package SSSPA;
import java.util.*;
public class BellmanfordMain 
{
	public static void main(String[] args)
	{
		ArrayList<Vertex> v=new ArrayList<>();
		Vertex A = new Vertex("A");
		Vertex B = new Vertex("B");
		Vertex C = new Vertex("C");
		Vertex D = new Vertex("D");
		Vertex E = new Vertex("E");
		v.add(A);
		v.add(B);
		v.add(C);
		v.add(D);
		v.add(E); 
		
		ArrayList<Edge> e=new ArrayList<>();
		e.add(new Edge(10,A,B));
		e.add(new Edge(10,A,C));
		e.add(new Edge(1,B,D));
		e.add(new Edge(3,C,B));
		e.add(new Edge(9,C,D));
		e.add(new Edge(2,C,E));
		e.add(new Edge(6,E,D));
		e.add(new Edge(7,E,A)); 
		
		BellmanFord f=new BellmanFord(v,e);
		
		f.bellmanfordAlgorithm(A, B);
		
		f.getShortestPathTo(B);
		
	}
}
