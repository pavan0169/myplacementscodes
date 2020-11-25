package hashing;

public class Main 
{
	public static void main(String[] args)
	{
		LinearProbing p=new LinearProbing();
		p.insert(12);
		p.insert(23);
		p.insert(4);
		p.insert(7);
		p.insert(2);
		p.insert(11);
		p.insert(76);
		p.insert(3);
		p.insert(21);
		p.insert(41);
		p.insert(40);
		p.insert(91);
		p.insert(88);
		p.insert(45);
		p.insert(39);
		p.insert(53);
		
		p.search(12);
		p.search(9);
		p.search(40);
		p.search(11);
		p.search(2);
		p.search(7);
		p.search(3);
		System.out.println(p.size);
	}
}
