package graphs;

public class BFS_IIMain 
{
	public static void main(String[] args)
	{
		BFS_II s=new BFS_II(15);
		
		s.undirectedEdges(1,2);
		s.undirectedEdges(1,3);
		s.undirectedEdges(2,4);
		s.undirectedEdges(2,5);
		s.undirectedEdges(4,8);
		s.undirectedEdges(4,9);
		s.undirectedEdges(5,10);
		s.undirectedEdges(5,11);
		s.undirectedEdges(3,6);
		s.undirectedEdges(3,7);
		s.undirectedEdges(6,12);
		s.undirectedEdges(6,13);
		s.undirectedEdges(7,14);
		s.undirectedEdges(7,15);
		
		/*s.undirectedEdges(1,5);
		s.undirectedEdges(1,6);
		s.undirectedEdges(5,2);
		s.undirectedEdges(2,6);
		s.undirectedEdges(6,3);
		s.undirectedEdges(2,3);
		s.undirectedEdges(3,4);
		s.undirectedEdges(4,7);
		s.undirectedEdges(3,7);
		s.undirectedEdges(4,8);
		s.undirectedEdges(7,8);*/
		
		s.bfs();
	}
}
