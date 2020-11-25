import java.util.*;
public class PaliSubLength
{ 
    static Boolean isPalindrome(String str) 
    { 
        int n = str.length(); 
        for (int i = 0; i < n/2; i++) 
            if (str.charAt(i) != str.charAt(n-i-1)) 
                return false; 
        return true; 
    } 
    static int Substring(String str) 
    { 
        int n = str.length(); 
        char ch = str.charAt(0); 
        int i = 1; 
        for (i = 1; i < n; i++) 
            if(str.charAt(i) != ch) 
                break; 
        if (i == n) 
            return 0; 
        if (isPalindrome(str)) 
            return (n/2)+1; 
        return n; 
    }
    public static void main(String args[]) 
    { 
    	Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
        System.out.println(Substring(str)); 
    } 
} 