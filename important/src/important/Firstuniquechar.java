package important;
import java.util.*;

public class Firstuniquechar 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int index=firstUniqChar(s);
		System.out.println(index);
		sc.close();
	}
	public static int firstUniqChar(String s) 
    {
        int[] arr=new int[256];
        int index=-1;
        for(int i=0; i<s.length(); i++)
        {
            arr[s.charAt(i)]++;
        }
        for(int i=0; i<s.length(); i++)
        {
            if(arr[s.charAt(i)]==1)
            {
                index=i;
                break;
            }
        }
        return index;
    }
}

