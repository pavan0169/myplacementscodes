import java.util.*;
public class ModHashing {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(mod(n));
	}
	public static int mod( int a)
	{
		return a%16;
	}
}
