package basic;

import java.util.Scanner;

public class BinaryAdd2 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int B1=Integer.parseInt(sc.nextLine(),2)+Integer.parseInt(sc.nextLine(),2);
		String B2=Integer.toString(B1,2);
		System.out.println(B2);
		
	}
}
