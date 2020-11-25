package min.spanningtree;
import java.util.*;
public class DisjointSet 
{
	
	public static void makeset(ArrayList<WeightedNode> nodes)
	{
		for(WeightedNode node: nodes)
		{
			WeightedNode tmp=node;
			node.set.add(tmp); 
		}
	}
	
	public static ArrayList<WeightedNode> findset(WeightedNode node)
	{
		return node.set;
	}
	
	public static ArrayList<WeightedNode> union(WeightedNode a,WeightedNode b)
	{
		if(a.set.equals(b.set))
		{
			return null;
		}
		else
		{
			if(a.set.size()>b.set.size())
			{
				ArrayList<WeightedNode> node2=b.set;
				for(WeightedNode node:node2)
				{
					node.set=a.set;
					a.set.add(node);
				}
				return a.set;
			}
			else
			{
				ArrayList<WeightedNode> node1=a.set;
				for(WeightedNode node:node1)
				{
					node.set=b.set;
					b.set.add(node);
				}
				return b.set;
			}
		}
	}
}
