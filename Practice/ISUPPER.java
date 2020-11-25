import java.util.*;
public class ISUPPER {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=0;
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			if(Character.isUpperCase(ch))
			{
				n++;
			}
		}
		System.out.println(n);
	}

}
