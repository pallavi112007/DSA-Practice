class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int arr[]=new int[2];
        int k=0;
        int left=0;
        int right=numbers.length-1;
        while(left<right)
        {
            if(numbers[left]+numbers[right]==target)
            {
                arr[k++]=left+1;
                arr[k++]=right+1;
                return arr;
            }
            else if(numbers[left]+numbers[right]<target)
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return arr;
    }
}
