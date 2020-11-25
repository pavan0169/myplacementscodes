package bitmanipulation;
import java.util.*;

public class CrackTheCode5_1 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String ms=sc.next();
		String ns=sc.next();
		int i=sc.nextInt();
		int j=sc.nextInt();
		int m=Integer.valueOf(ms, 2);
		int n=Integer.valueOf(ns, 2);
		m=m | (n<<i);
		System.out.println(Integer.toBinaryString(m));
	}
}
