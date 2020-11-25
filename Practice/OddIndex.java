import java.util.*;
public class OddIndex 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < T; i++) 
		{
		    String s = sc.nextLine();
		    String even = "";
		    String odd = "";
		    for (int j = 0; j < s.length(); j++) 
		    {
		        if (j % 2 == 0) 
		        {
		            even += s.charAt(j);
		        } 
		        else 
		        {
		            odd += s.charAt(j);
		        }
		    }

		    System.out.println(even + " " + odd);
		}
	}
}

