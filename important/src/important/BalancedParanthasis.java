package important;
import java.util.*;

public class BalancedParanthasis 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		boolean s1=balancedParanthesis(s);
		System.out.println(s1);
	}
	
	public static boolean balancedParanthesis(String s)
	{
		Stack<Character> stack=new Stack<Character>();
		for(int i=0;i<s.length();i++)
		{
			char  ch=s.charAt(i);
			if(ch=='{' || ch=='(' || ch=='[')
			{
				stack.push(ch);
			}
			else if(ch=='}' || ch==')' || ch==']')
			{
				if(stack.isEmpty())
				{
					return false;
				}
				char x=stack.peek();
				if((ch=='}' && x=='{')||( ch==']' && x=='[') ||( ch==')' && x== '('))
				{
					stack.pop();
				}
				else
				{
					return false;
				}	
			}
		}
		if(stack.isEmpty())
		{
			return true;
		}
		return false;
	}
}



/*

package important;
import java.util.*;

public class BalancedParanthasis 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		boolean out=balanced(s);
		System.out.println(out);
	}
	
	public static boolean balanced(String s)
	{
		Stack<Character> stack=new Stack<>();
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			if(Character.isLetterOrDigit(ch))
			{
				continue;
			}
			else if(ch=='(' || ch=='{' || ch=='[')
			{
				stack.push(ch);
			}
			else if(ch==')' || ch==']' || ch=='}')
			{
				if(stack.isEmpty())
				{
					return false;
				}
				char x=stack.peek();
				boolean p=true;
				if(ch==')')
				{
					p=(x=='(');
				}
				if(ch=='}')
				{
					p=(x=='{');
				}
				if(ch==']')
				{
					p=(x=='[');
				}
				
				if(p)
				{
					stack.pop();
				}
				else
				{
					return false;
				}
				
			}
		}
		
		if(stack.isEmpty())
		{
			return true;
		}
		return false; 
	}
}


*/