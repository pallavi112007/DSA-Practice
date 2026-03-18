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
            int found=0;
            for(int j=i;j<i+k;j++)
            {
                if(arr[j]<0)
                {
                    q.add(arr[j]);
                    found=1;
                    break;
                }
            }
            if(found==0)
            {
                q.add(0);
            }
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
-1 -1 -7 -15 -15 -28 
