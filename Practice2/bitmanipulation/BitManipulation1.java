package bitmanipulation;

public class BitManipulation1 
{
	public static void main(String [] args)
	{
		int a=-200;
		int b=30;
		
		String sa=Integer.toBinaryString(a);
		String sb=Integer.toBinaryString(b);
		System.out.println("Binary of "+ a +" is :"+sa);
		System.out.println("Binary of "+ b +" is :"+sb);
		a>>=1;
		//System.out.println(a^1);
		System.out.println(a);
		
	}
}
