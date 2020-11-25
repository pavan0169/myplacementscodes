package min.spanningtree;
import java.util.*;

public class WeightedNode implements Comparable<WeightedNode>
{
	public String name;
	public int index;
	public HashMap<WeightedNode, Double> weightMap = new HashMap<>();
	public ArrayList<WeightedNode> neighbor=new ArrayList<>();
	public boolean visited;
	public WeightedNode parent;
	public double distance;
	public ArrayList<WeightedNode> set=new ArrayList<>(); 
	
	public WeightedNode(String name) {
		this.name = name;
		this.distance=Double.MAX_VALUE;
	}
	
	public String toString()
	{
		return this.name;
	}

	@Override
	public int compareTo(WeightedNode o) 
	{
		return Double.compare(this.distance, o.distance);
	}
}
