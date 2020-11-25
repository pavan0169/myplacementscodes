package important;

import java.util.Scanner;

public class LongestCommonSubstring 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int index=longestCommonSubstring(s1, s2);
		System.out.println(index);
		sc.close();
	}
	
	public static int longestCommonSubstring(String s1, String s2)
	{
		int ans=0;
		int[][] dp=new int[s1.length()+1][s2.length()+1];
		for(int i=s1.length()-1; i>=0; i--)
		{
			for(int j=s2.length()-1; j>=0; j--)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					dp[i][j]=1+dp[i+1][j+1];
					if(ans<dp[i][j])
					{
						ans=dp[i][j];
					}
				}
			}
		}
		return ans;
	}
}
