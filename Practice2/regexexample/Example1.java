package regexexample;
import java.util.*;
import java.util.regex.*;

public class Example1 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String ipv4chunk="([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
		Pattern p=Pattern.compile("^(" +ipv4chunk+ "\\.){3}"  +ipv4chunk+"$");
		String in=sc.nextLine();
		Matcher m=p.matcher(in);
		System.out.println(m.matches()+" - ");
	}
}
