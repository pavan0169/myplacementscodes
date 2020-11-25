package stacks;

public class StackAMain 
{
	public static void main(String[] args)
	{
		StackA s=new StackA(7);
		
		s.push(10);
		s.push(40);
		s.push(50);
		s.push(60);
		s.push(70);
		s.push(80);
		s.push(30);
		s.push(10);
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop(); 
		s.peek();
	}
}
