import java.util.*;
public class Chall1 
{
	static LinkedHashMap<Integer,String> l=new LinkedHashMap<Integer,String>();
	
 static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		l.put(n+1,"4LB");
		l.put(n+2,"5MB");
		l.put(n+3,"6UB");
		l.put(n+4,"1LB");
		l.put(n+5,"2MB");
		l.put(n+6,"3UB");
		l.put(n+7,"8SL");
		l.put(n+8,"7SU");
		
		System.out.println(l.get(n));
	}

}
