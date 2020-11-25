package datastructures;
import java.util.*;

public class InfixToPostfix 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String post=intopost(s);
		sc.close();
		System.out.println(post);
	}
	public static String intopost(String s)
	{
		String result="";
		Stack<Character> stack=new Stack<>();
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			if(Character.isLetterOrDigit(ch))
			{
				result+=ch;
			}
			else if(ch=='(')
			{
				stack.push(ch);
			}
			else if(ch==')')
			{
				while(!stack.isEmpty() && stack.peek() != '(')
				{
					result=result+stack.pop();
				}
				if(!!stack.isEmpty() && stack.peek()!='(')
				{
					return "illegal string";
				}
				else
				{
					stack.pop();
				}
			}
			else
			{
				while(!stack.isEmpty() && preced(ch)<=preced(stack.peek()))
				{
					if(stack.peek()==')')
					{
						return "illegal string";
					}
					result=result+stack.pop();
				}
				stack.push(ch);
			}
		}
		while (!stack.isEmpty())
		{ 
            if(stack.peek() == '(')
            {
                return "Invalid Expression"; 
            }
            result += stack.pop(); 
         }
		return result;
	}
	
	
	
	public static int preced(char a)
	{
		switch(a)
		{
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		}
		return -1;
	}
}
