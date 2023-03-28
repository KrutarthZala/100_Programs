import java.util.Scanner;

public class P7Fibonacci {
    public static void main(String[] args) {
        int n, f = 0, s = 1, sum;
        Scanner kz = new Scanner(System.in);

        System.out.print("Enter the term number : ");
        n = kz.nextInt();
        
        System.out.print(f + " " + s + " ");
        for (int i = 0; i < n - 2; i++) {
            sum = f + s;
            f = s;
            s = sum;
            System.out.print(sum + " ");
        }
    }
}
