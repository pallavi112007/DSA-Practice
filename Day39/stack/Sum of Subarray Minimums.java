import java.util.*;
class Solution
{
	public static void main(String[] args)
	{
		int arr={3,1,4,6};
		int sum=0;
		int min=Integer.MAX_VALUE;
		int minmin=0;
		for(int i=0;i<arr.length;i++)
		{
			int min=Integer.MAX_VALUE;
			for(int j=i;j<arr.length;j++)
			{
				min=Math.min(min,arr[j]);
				sum+=min;
			}
		}
		System.out.println(sum);
	}
}
//output
 18
