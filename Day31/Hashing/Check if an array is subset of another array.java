import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b={1,2,3};
        int found=0;
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(a[j]==b[i])
                found=1;
                break;
            }
            if(found==0)
            {
                System.out.print("False");
                return;
            }
        }
        System.out.print("true");
        return;
    }
}
//output
true
