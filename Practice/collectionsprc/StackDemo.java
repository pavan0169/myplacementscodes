package collectionsprc;
import java.util.*;
public class StackDemo {
	public static void main(String[] args)
	{
		Stack v=new Stack();
		v.push("String6-");
		v.push("String5-");
		v.push("String4-");
		v.push("String3-");
		v.push("String2-");
		v.push("String1-");
		v.add("String6");
		v.add("String5");
		v.add("String4");
		v.add("String3");
		v.add("String2");
		v.add("String1");
		v.pop();
		v.pop();
		v.pop();
		v.pop();


		
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.peek());

	}

}
