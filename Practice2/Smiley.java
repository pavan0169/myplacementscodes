import java.util.*;

class Emp 
{
	String name;
	String ID;
	int CPR_number;
	int Mobile_number;
	String e_mail;
	
	public void setdetails()
	{
		Scanner sc=new Scanner(System.in);
		this.name=sc.nextLine();
		this.ID=sc.nextLine();
		this.CPR_number=sc.nextInt();
		this.Mobile_number=sc.nextInt();
		this.e_mail=sc.nextLine();
		sc.close();
	}
	public void getdetails()
	{
		System.out.println(name);
		System.out.println(ID);
		System.out.println(CPR_number);
		System.out.println(Mobile_number);
		System.out.println(e_mail);
	}
	public void searchnumber()
	{
		System.out.println(Mobile_number);
	}
	public void editnumber(int newnum)
	{
		this.Mobile_number=newnum;
	}
	public void deletenumber()
	{
		this.Mobile_number=0;
	}
}
