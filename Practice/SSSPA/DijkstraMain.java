package SSSPA;

public class DijkstraMain 
{
	public static void main(String[] args)
	{
		Dijkstra ds=new Dijkstra();
		
		Vertex A = new Vertex("A");
		Vertex B = new Vertex("B");
		Vertex C = new Vertex("C");
		Vertex D = new Vertex("D");
		Vertex E = new Vertex("E");
		
		
		A.edges.add(new Edge(10,A,B));
		A.edges.add(new Edge(10,A,C)); 
		B.edges.add(new Edge(1,B,D));
		C.edges.add(new Edge(3,C,B));
		C.edges.add(new Edge(9,C,D));
		C.edges.add(new Edge(2,C,E));
		E.edges.add(new Edge(6,E,D));
		E.edges.add(new Edge(7,E,A)); 
		
		ds.dijkstraMethod(A); 
		
		
		System.out.println("Shortest Path from A to B: ");
		ds.getShortestPathTo(D);
		//for(Vertex v:)
	}
}
