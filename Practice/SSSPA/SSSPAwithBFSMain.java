package SSSPA;

public class SSSPAwithBFSMain 
{
	public static void main(String[] args)
	{
		SSSPAwithBFS s=new SSSPAwithBFS(8);
		
		s.undirectedEdges(1,5);
		s.undirectedEdges(1,6);
		s.undirectedEdges(5,2);
		s.undirectedEdges(2,6);
		s.undirectedEdges(6,3);
		s.undirectedEdges(2,3);
		s.undirectedEdges(3,4);
		s.undirectedEdges(4,7);
		s.undirectedEdges(3,7);
		s.undirectedEdges(4,8);
		s.undirectedEdges(7,8);
		System.out.println("Printing SHORTEST PATH from source: V1 : to");
		s.shortestPath(s.nodes.get(0));
	}
}
