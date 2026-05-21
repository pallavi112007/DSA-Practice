import java.util.*;

class A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 1;

        int m = n & (-n);

        while (m > 1) {
            m = m >> 1;
            count++;
        }

        System.out.println(count);
    }
}
