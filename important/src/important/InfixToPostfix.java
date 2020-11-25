package important;

import java.util.*;

public class InfixToPostfix 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String r=infixToPostfix(s);
		System.out.println(r);
	}
	 static int prec(char ch) 
	 { 
	        switch (ch) 
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
		String out="";
		Stack<Character> stack=new Stack<>();
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			if(Character.isLetterOrDigit(ch))
			{
				out=out+ch;
			}
			else if(ch=='(')
			{
				stack.push(ch);
			}
			else if(ch==')')
			{
				while(!stack.isEmpty() && stack.peek()!='(')
				{
					out=out+stack.pop();
				}
				stack.pop();
			}
			else
			{
				while(!stack.isEmpty() && prec(ch)<=prec(stack.peek()))
				{
					if(stack.peek()=='(')
					{
						return "Invalid Expression";
					}
					out=out+stack.pop();
				}
				stack.push(ch);
			}
		}
		
		while (!stack.isEmpty()){ 
            if(stack.peek() == '(') 
                return "Invalid Expression";// /*   ////  // //  /* ,nkj*/*/
            out += stack.pop(); 
         }
		return out;
	}
}
