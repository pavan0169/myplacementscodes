package graphs;

public class DFSMain 
{
	public static void main(String[] args)
	{
		DFS s=new DFS(15);
		
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
		
		
		
		s.dfs();
	}
}
