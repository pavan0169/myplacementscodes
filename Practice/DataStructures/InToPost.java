package DataStructures;
import java.util.*;
public class InToPost 
{
	static Stack<Character> s=new Stack<Character>();
	
	public static int precedence(char ch)
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
	
	
	
	public static String inToPost(String st)
	{
		try {
		String result="";
		for(int i=0; i<st.length(); i++)
		{
			char ch=st.charAt(i);
			if(Character.isLetterOrDigit(ch))
			{
				result=result+ch;
			}
			else if(ch=='(')
			{
				s.push(ch);
			}
			else if(ch==')')
			{
				while(!s.isEmpty() && s.peek()!='(')
				{
					result=result+s.pop();
				}
				s.pop();
			}
			else
			{
				while(!s.isEmpty() && precedence(ch)<=precedence(s.peek()))
				{
					result=result+s.pop();
				}
				s.push(ch);
			}
		}
		while(!s.isEmpty())
		{
			if(s.peek() == '(') 
                return "Invalid Expression"; 
			result=result+s.pop();
		}
		return result;
	}catch(Exception e)	{
		return "Invalid expeww";
		}
		
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		System.out.println(inToPost(st));
	}

}
