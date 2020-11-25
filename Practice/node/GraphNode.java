package node;
import java.util.*;

public class GraphNode 
{
	public String name;
	public int index;
	public ArrayList<GraphNode> neighbours =new ArrayList<>();
	public boolean isVisited=false;
	public GraphNode parent;
	
	public GraphNode(String name, int index)
	{
		this.name=name;
		this.index=index;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public ArrayList<GraphNode> getNeighbour() {
		return neighbours;
	}

	public void setNeighbour(ArrayList<GraphNode> neighbour) {
		this.neighbours = neighbour;
	}

	public boolean isVisited() {
		return isVisited;
	}

	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}

	public GraphNode getParent() {
		return parent;
	}

	public void setParent(GraphNode parent) {
		this.parent = parent;
	}

	@Override
	public String toString() {
		return name +" - "+ index+ "  "; 
	}
	
	
}
