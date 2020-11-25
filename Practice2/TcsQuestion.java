import java.util.*;

class TcsQuestion 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String[] maxlimit=sc.nextLine().trim().split("[a-zA-Z]");
		String[] itemval=sc.nextLine().trim().split("[|]");
		
		int[] max=new int[maxlimit.length];
		for(int i=0; i<max.length; i++)
		{
			max[i]=Integer.valueOf(maxlimit[i].trim());
		}
		int[][] items=new int[itemval.length][];
		for(int i=0; i<itemval.length; i++)
		{
			String[] temp=itemval[i].split("[a-zA-Z]");
			int[] tem=new int[temp.length];
			for(int j=0; j<temp.length; j++)
			{
				tem[j]=Integer.valueOf(temp[j].trim());
			}
			items[i]=tem;
		}
		
		sortbyColumn(items,2);
		sortbyColumn(items,1);
		sortbyColumn(items,0);
		
		
		int[] mydiet=new int[3];
		while(mydiet[0]<max[0] && mydiet[1]<max[1] && mydiet[2]<max[2])
		{
			mydiet[0]+=items[0][0]+items[1][0]+items[2][0];
			mydiet[1]+=items[0][1]+items[1][1]+items[2][1];
			mydiet[2]+=items[0][2]+items[1][2]+items[2][2];
		}
		System.out.print(max[0]-mydiet[0]+" ");
		System.out.print(max[1]-mydiet[1]+" ");
		System.out.print(max[2]-mydiet[2]+" ");
	}
	
	public static void sortbyColumn(int arr[][], int col)
    {
        Arrays.sort(arr, new Comparator<int[]>() 
        { 
          public int compare( int[] entry1, int[] entry2) 
          { 
            if (entry1[col] < entry2[col]) 
                return 1; 
            else
                return -1; 
          }
        });
    }
}
