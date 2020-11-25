import java.util.*;
public class Pranthisis {
	static Stack<Character> s=new Stack<Character>();
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String bar=sc.nextLine();
		getBool(bar);
		if(s.isEmpty())
		{
			System.out.println("Correct parantheses");
		}
		else
		{
			System.out.println("Incorrect parantheses");
		}
	}
	public static void getBool(String bar)
	{
		for(int i=0; i<bar.length(); i++)
		{
			char ch=bar.charAt(i);
			if(ch== '[' || ch== '{' || ch== '(')
			{
				s.push(ch);
			}
			else if(ch== ']' || ch== '}' || ch== ')')
			{
				s.pop();
			}
		}
	}
}
