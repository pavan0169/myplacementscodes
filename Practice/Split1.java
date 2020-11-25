import java.util.*;
public class Split1 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String input = "hello world i am pk";
		String[] n = input.split("e"); 
		for(String n1:n)
		{
			System.out.println(n1);
		}
	}


}
