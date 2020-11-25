package collectionsprc;
import java.util.*;
import java.io.*;
class Gen<T>
{
	T obj;
	Gen(T obj)
	{
		this.obj=obj;
	}
	public void show()
	{
		System.out.println("type name is :"+ obj.getClass().getName());
	}
	public T getObj()
	{
		return obj;
	}
}


public class GenericsDemo 
{
	public static void main(String[] args)
	{
		Gen<String> g1=new Gen<String>("Pavan");
		g1.show();
		System.out.println(g1.getObj());
		
		Gen<Integer> g2=new Gen<Integer>(10);
		g2.show();
		System.out.println(g2.getObj());
		
		Gen<Float> g3=new Gen<Float>(10.99f);
		g3.show();
		System.out.println(g3.getObj());
		
		Gen<Double> g4=new Gen<Double>(43.99);
		g4.show();
		System.out.println(g4.getObj());
	}
}
