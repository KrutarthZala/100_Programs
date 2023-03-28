import java.util.*;

public class PrimeNumsP10 {
    public static void main(String[] args) {
        int n1, n2, count = 0;
        Scanner kz = new Scanner(System.in);

        System.out.print("Enter first number : ");
        n1 = kz.nextInt();
        System.out.print("Enter second number : ");
        n2 = kz.nextInt();

        for (int i = n1; i <= n2; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
            count = 0;
        }

    }
}
