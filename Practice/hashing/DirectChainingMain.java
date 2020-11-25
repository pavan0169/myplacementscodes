package hashing;

public class DirectChainingMain 
{
	public static void main(String[] args)
	{
		DirectChaining dc=new DirectChaining();
		dc.insert("PAVAN");
		dc.insert("VANPA");
		dc.insert("PNAVA");
		dc.insert("NPAVA");
		dc.insert("PANVA");
		dc.insert("VANPA");
		System.out.println();
		System.out.println(dc.search("PAVAN"));
		System.out.println(dc.search("VANPA"));
		System.out.println(dc.search("PNAVA"));
		System.out.println(dc.search("NPAVA"));
		System.out.println(dc.search("PANVA"));
		System.out.println();
		dc.delete("NPAVA");
		dc.delete("PANVA");
		dc.delete("VANPA");
		
		System.out.println(dc.search("PNAVA"));
		System.out.println(dc.search("NPAVA"));
		System.out.println(dc.search("PANVA"));
	}
}
