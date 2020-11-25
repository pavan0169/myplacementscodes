import java.util.*;
public class SwitchEg 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		switch(str)
		{
		case "Pavan":
			System.out.println("16MIS0169");
			break;
		case "Vamsi":
			System.out.println("16MIS0170");
			break;
		case "Kande":
			System.out.println("16MIS0272");
			break;
		case "Atchuth":
			System.out.println("16MIS0176");
			break;
		case "Kotra":
			System.out.println("16MIS0242");
			break;
		case "Tarun":
			System.out.println("16MIS0265");
			break;
		default:
			System.out.println("Member not found");
		}
		sc.close();
	}
}
