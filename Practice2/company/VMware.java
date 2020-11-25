package company;
import java.util.*;

public class VMware 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		String date=sc.nextLine();
		String gender=sc.nextLine();
		
		String out=idGenerator(name, date, gender);
		System.out.println(out);
	}
	
	static String idGenerator(String name, String date, String gender)
	{
		String out="";
		char ind_1,ind_2,ind_3,ind_4,ind_5;
		
		ind_1=name.charAt(0);
		ind_2=date.charAt(0);
		ind_3=date.charAt(1);
		ind_4=0;
		ind_5=0;
		if(gender.charAt(0)=='M')
		{
			ind_4=date.charAt(3);
			ind_5=date.charAt(4);
		}
		else if(gender.charAt(0)=='F')
		{
			String temp=date.substring(3, 5);
			int a=Integer.parseInt(temp);
			a+=50;
			temp=Integer.toString(a);
			ind_4=temp.charAt(0);
			ind_5=temp.charAt(1);
		}
		
		out=out+ind_1+ind_2+ind_3+ind_4+ind_5;
		return out;
	}
	
}
