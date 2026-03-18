import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Queue<Integer> q=new LinkedList();
        for(int i=0;i<=arr.length-k;i++)
        {
            int max=0;
            for(int j=i;j<i+k;j++)
            {
                max=Math.max(arr[j],max);
            }
            q.add(max);
        }
        while(!q.isEmpty())
        {
            System.out.print(q.poll()+" ");
        }
    }
}
//Input
8
3
12 -1 -7 8 -15 30 16 -28
//output
12 8 8 30 30 30 

