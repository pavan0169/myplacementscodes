package leet;

public class TwoSum 
{
	public static void main(String[] args)
	{
		int[] nums= {2,7,11,15};
		int target=18;
		int[] out=twoSum(nums,target);
		for(int i=0; i<2; i++)
		{
			System.out.println(out[i]);
		}
	}
	public static int[] twoSum(int[] nums, int target) 
    {
        
        int i=0;
        int j=nums.length-1;
        while(i<j)
        {
            if(nums[i]+nums[j]>target)
            {
                j--;
            }
            else if(nums[i]+nums[j]<target)
            {
                i++;
            }
        }
        return new int[]{i,j};
        
    }
}
