package hack;
import java.util.*;
public class LongWord 
{
	public static void main(String[] args) 
    { 
		Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(LongWord(s)); 
    }
	
	public static String LongWord(String s)
	{
		String[] words = s.split("[, !#%^&*?.@]+"); 
        int length = 0;
        String out="";
        for(String word:words)
        { 
            if(length < word.length())
            { 
                length = word.length();  
            }  
        } 
        for(String word:words)
        {
        	if(length== word.length())
        	{
        		out=word;
        	}
        }
        return out;
	}
}
