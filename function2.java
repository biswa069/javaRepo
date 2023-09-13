import java.util.*;

public class function2 {
    public static void prime(int n) {
        int count = 0;
        int i;
        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;

            }

        }
        if (count == 2) {
            System.out.println("This is prime");
        } else {
            if (count != 2 || n == 0) {
                System.out.println("This is not prime");

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number:");
        int n = sc.nextInt();
        prime(n);
    }
}
