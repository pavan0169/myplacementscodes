package datastructures;

public class DijkstraMain 
{
	public static void main(String[] args)
	{
		Dijkstra dj=new Dijkstra();
		Vertex A=new Vertex("A");
		Vertex B=new Vertex("B");
		Vertex C=new Vertex("C");
		Vertex D=new Vertex("D");
		Vertex E=new Vertex("E");
		Vertex F=new Vertex("F");
		Vertex G=new Vertex("G");
		
		A.edges.add(new Edge(1,A,B));
		A.edges.add(new Edge(8,A,E));
		B.edges.add(new Edge(2,B,C));
		B.edges.add(new Edge(1,B,D));
		C.edges.add(new Edge(5,C,G));
		C.edges.add(new Edge(10,C,D));
		D.edges.add(new Edge(1,D,G));
		E.edges.add(new Edge(7,E,F));
		F.edges.add(new Edge(3,F,G));
		
		dj.dijkstra(A);
		dj.getShortestPath(G);
		
		
		
	}
}
