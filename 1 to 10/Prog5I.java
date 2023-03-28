import java.util.Scanner;

public class Prog5I {
    public static void main(String[] args) {
        int n, sum = 0, d;
        Scanner kz = new Scanner(System.in);

        System.out.print("Enter the digit : ");
        n = kz.nextInt();

        while (n > 0) {
            d = n % 10;
            sum += d;
            n /= 10;  
        }

        System.out.println("Summation of digits of given number is : " + sum);
    }
}
