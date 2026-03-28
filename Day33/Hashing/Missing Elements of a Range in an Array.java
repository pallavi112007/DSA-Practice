{
    public static void main(String[] args) throws java.lang.Exception
    {
        HashSet<Integer> set = new HashSet<>();
        int arr[] = {4, 5, 3, 8, 6};
        int n=arr.length;
        int low=arr[0];
        int high=arr[0];
        int minn=Integer.MAX_VALUE;
        int maxx=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++)
        {
            set.add(arr[i]);
            if(arr[i]<low)
            {
                low=arr[i];
            }
            if(arr[i]>high)
            {
                high=arr[i];
            }
        }
        int count=0;
        for (int i = low; i <= high; i++)
        {
            if(!set.contains(i))
            {
                count++;
            }
        }
        System.out.print(count);
    }
}
//output
1
