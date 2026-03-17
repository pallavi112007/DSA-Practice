import java.util.*;

class Main {
    public static void main(String[] args) {
        int n = 4;

        for(int i = n; i >=0 ; i--) {

            // spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars
            for(int j = 1; j <= 2*i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
//output
*******
 *****
  ***
   *
