package DataStructures;
import java.util.*;
public class InfixToPostfix 
{
	static Stack<Character> stc=new Stack<Character>();
	public static int prec(char ch)
	{
		switch(ch)
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
	
	public static String infixToPostfix(String s)
	{
		String result="";
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			if(Character.isLetterOrDigit(ch))
			{
				result+=ch;
			}
			
			else if(ch=='(')
			{
				stc.push(ch);
			}
			
			else if(ch==')')
			{
				while(!stc.isEmpty() && stc.peek() != '(')
				{
					result+=stc.pop();
				}
				/*if(!stc.isEmpty() && stc.peek() != '(')
					return "Invalid String";
				else*/
					stc.pop();
			}
			
			else
			{
				while(!stc.isEmpty() && prec(ch)<=prec(stc.peek()))
				{
					
					if(stc.peek() == '(') 
                        return "Invalid Expression";
					result+=stc.pop();
				}
				stc.push(ch);
			}
		}
		
		while(!stc.isEmpty())
		{
			if(stc.peek() == '(' || stc.peek() == ')') 
                return "Invalid Expression";
			result+=stc.pop();
		}
		return result;
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(infixToPostfix(s));
		sc.close();
	}
	
}
