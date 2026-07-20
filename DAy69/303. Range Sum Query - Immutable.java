class NumArray {
    int arr[];
    public NumArray(int[] nums) {
        arr=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            arr[i]=sum;
        }
    }
    
    public int sumRange(int left, int right) {
        if(left==0)
        {
            return arr[right];
        }
        return arr[right]-arr[left-1];
    }
}

