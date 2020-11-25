package dp;
import java.util.*;

public class Fibonacci 
{
	public static int fib(int n)
	{
		int[] arr=new int[n+2]; // because we have to store min values like arr[0]=0, and arr[1]=1
		arr[0]=0;
		arr[1]=1;
		for(int i=2; i<=n; i++)
		{
			arr[i]=arr[i-1]+arr[i-2];
		}
		return arr[n]; 
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fib(n));
		Stack<Integer> stack=new Stack<>();
		stack.add(10);
		stack.add(34);
		stack.add(1);
		System.out.println(stack.peek());
		System.out.println(stack);
		for(int i: stack)
		{
			System.out.print(i+" ");
		}
	}
}




//if u want to get o(1) time complexity for fibonacci then Math.pow( [(1+Math.sqrt(5))/2] , n )/Math.sqrt(5);