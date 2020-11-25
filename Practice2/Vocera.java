import java.util.*;
class Vocera 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int p1=sc.nextInt();
		int l1=sc.nextInt();
		int p2=sc.nextInt();
		int l2=sc.nextInt();
		int read=sc.nextInt();
		int write=sc.nextInt();
		int time=sc.nextInt();
		
		int totlines1=p1*l1;
		int totlines2=p2*l2;
		
		int timeforread=totlines1/read;
		int timeforwrite=totlines2/write;
		
		time=time-timeforread;
		if(time<0)
		{
			//read
			int x=Math.abs(time);
			int lines=(x/timeforread)*totlines1;
			int page=lines/l1;
			int line=lines%l1;
			System.out.println("READ "+page+" "+line);
		}
		else
		{
			int x=Math.abs(time);
			int lines=(x/timeforwrite)*totlines2;
			int page=lines/l2;
			int line=lines%l2;
			System.out.println("WRITE "+page+" "+line+" "+x+" "+lines);
		}
	}
}

