package hashing;

public class LinearProbingMain 
{
	public static void main(String[] args)
	{
		LinearProbing lp=new LinearProbing();
		lp.insert("PAVAN");
		lp.insert("VANPA");
		lp.insert("PNAVA");
		lp.insert("NPAVA");
		lp.insert("PANVA");
		lp.insert("PAVAN");
		lp.insert("VANPA");
		lp.insert("PNAVA");
		lp.insert("NPAVA");
		lp.insert("PANVA");
		lp.insert("ABCDE");
		System.out.println(lp.search("PAVAN"));
		System.out.println(lp.search("ABCDE"));
		lp.delete("PAVAN");
		lp.delete("PANVA");
		lp.delete("PAVAN");
		lp.delete("VANPA");
		lp.delete("PNAVA");
		lp.delete("NPAVA");
		lp.delete("PANVA");
		lp.delete("ABCDE");
		lp.displayhashtable();
	}
}
