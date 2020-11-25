package company;
import java.util.Scanner;
public class ReverseString 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String b=reverse(s1);
		System.out.println(b);
	}
	
	public static String reverse(String s)
	{
		int i=0; 
		int j=s.length()-1;
		char[] arr=s.toCharArray();
		while(i<j)
		{
			char temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		String out="";
		for(char a:arr)
		{
			out=out+a;
		}
		return out;
	}
}
	