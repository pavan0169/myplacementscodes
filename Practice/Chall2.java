import java.util.*;
public class Chall2 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int w=sc.nextInt();
		int h=sc.nextInt();
		if((w<l)||(h<l))
			System.out.println( "CHANGE" );
		else if(w!=h)
		{
			System.out.println( "crop" );
		}
		else
			System.out.println( "accepted" );
		}
	}

//String s=((w<l)||(h<l))? "CHANGE" :((w==h)? "ACCEPTED": "CROP");


		//System.out.println(s);