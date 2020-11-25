package important;
import java.util.*;

public class EvaluatePostfix 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int r=evaluatePostfix(s);
		System.out.println(r);
	}
	
	public static int evaluatePostfix(String s)
	{
		Stack<Integer> stack=new Stack<>();
		for(int i=0; i<s.length(); i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				stack.push(Integer.valueOf(s.charAt(i)+""));
			}
			else
			{
				int b=stack.pop();
				int a=stack.pop();
				if(s.charAt(i)=='+')
				{
					stack.push(a+b);
				}
				else if(s.charAt(i)=='-')
				{
					stack.push(a-b);
				}
				else if(s.charAt(i)=='*')
				{
					stack.push(a*b);
				}
				else if(s.charAt(i)=='/')
				{
					stack.push(a/b);
				}
			}
		}
		return stack.pop();
		
		
		
	}
}
