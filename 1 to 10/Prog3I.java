import java.util.*;

public class Prog3I {
    public static void main(String[] args) {
    
        Scanner kz = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n = kz.nextInt();

        System.out.println("Factors are : ");

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}
