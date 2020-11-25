package hashing;

public class QuardraticProbingMain 
{
	public static void main(String[] args)
	{
		QuardraticProbing qp=new QuardraticProbing();
		qp.insert("PAVAN");
		qp.insert("PAVAN");
		qp.insert("PAVAN");
		qp.insert("PAVAN");
		qp.insert("PAVAN");
		qp.insert("PAVAN");
		qp.insert("PAVAN");
		qp.insert("PAVAN");
		qp.insert("PAVAN");
		qp.insert("PAVAN");
		qp.insert("PAVAN");
		qp.insert("PAVAN");
		qp.insert("PAVAN");
		qp.insert("PAVAN");
		qp.displayHashTable();
		qp.delete("PAVAN");
		qp.displayHashTable();
		
		
		
		
		
		
		
		
		
		
		/*qp.insert("PAVAN");
		qp.insert("VANPA");
		qp.insert("PNAVA");
		qp.insert("NPAVA");
		qp.insert("PANVA");
		qp.insert("PAVAN");
		qp.insert("VANPA");
		qp.insert("PNAVA");
		qp.insert("NPAVA");
		qp.insert("PANVA");
		qp.insert("ABCDE");
		qp.displayHashTable();
		System.out.println(qp.search("PAVAN"));
		System.out.println(qp.search("ABCDE"));
		System.out.println(qp.search("ABC"));
		qp.delete("PAVAN");
		qp.delete("PANVA");
		qp.delete("PAVAN");
		qp.delete("VANPA");
		qp.delete("PNAVA");
		qp.delete("NPAVA");
		qp.delete("PANVA");
		qp.delete("ABCDE");
		qp.displayHashTable();*/
	}
}
