package min.spanningtree;

public class Edge implements Comparable<Edge> 
{
	public double weight;
	public WeightedNode starts;
	public WeightedNode ends;
	
	
	public Edge(double weight, WeightedNode starts, WeightedNode ends) {
		super();
		this.weight = weight;
		this.starts = starts;
		this.ends = ends;
	}


	@Override
	public int compareTo(Edge o) {
		return Double.compare(this.weight,o.weight);
	}
	
	public String toString() {
		return "Edge (" + starts + "," + ends + "), weight=" + weight + "]";
	}

}
