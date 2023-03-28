import java.util.Scanner;

public class P7FibonacciR {
    static int f = 0, s = 1, sum = 0;

    static void fibonacci(int a) {
        if (a > 0) {
            sum = f + s;
            f = s;
            s = sum;
            System.out.print(sum + " ");
            fibonacci(a - 1);
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner kz = new Scanner(System.in);

        System.out.print("Enter the term number : ");
        n = kz.nextInt();

        if (n == 1) {
            System.out.print("0");
        } else if (n == 2) {
            System.out.print("0 1");
        } else {
            System.out.print("0 1 ");
            fibonacci(n - 2);
        }
    }
}
