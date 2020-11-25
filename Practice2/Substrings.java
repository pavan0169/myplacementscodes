import java.util.*;

public class Substrings 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String out=repair(s);
		System.out.println();
		System.out.println();
		System.out.println(out);
	}
	
	static String repair(String s)
	{
		int i=0;
		int j=s.length()-1;
		while(j>=0)
		{
			if(Character.isDigit(s.charAt(i))) 
			{
				while(s.charAt(j)!='0' && j>=0)
				{
					j--;
				}
				s=s.substring(0,j)+s.charAt(i)+s.substring(j+1);
				s=s.substring(1);
				//System.out.println(s);
			}
			else
			{
				break;
			}
		}
		//h4Kc*3rr4Kn*
		//h4Kc*3rr4Kn*
		for(int k=2; k<s.length(); k++)
		{
			if(s.charAt(k)=='*' && Character.isLowerCase(s.charAt(k-1)) && Character.isUpperCase(s.charAt(k-2)))
			{
				char temp2=s.charAt(k-2);
				char temp1=s.charAt(k-1);
				s=s.substring(0,k-2)+temp1+s.substring(k-1);
				s=s.substring(0,k-1)+temp2+s.substring(k);
				s=s.substring(0,k)+s.substring(k+1);
				System.out.println(s);
			}
		}
		return s;
	}
}
//434h0Kc*0rr0Kn*
//51Pa*0Lp*0e
