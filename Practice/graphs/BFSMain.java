package graphs;

public class BFSMain 
{
	public static void main(String[] args)
	{
		BFS s=new BFS(6);
		
		s.undirectedEdge(1,2);
		s.undirectedEdge(1,4);
		s.undirectedEdge(2,3);
		s.undirectedEdge(3,5);
		s.undirectedEdge(4,5);
		s.undirectedEdge(4,6);
		s.undirectedEdge(5,6);
		
		s.bfs();
	}
}
