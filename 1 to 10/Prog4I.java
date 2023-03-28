import java.util.*;

class Prog4I
{
    public static void main(String[] args) {
        
        int n,fact = 1;
        Scanner kz = new Scanner(System.in);

        System.out.println("Enter the number : ");
        n = kz.nextInt();

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of given number is "+ fact);
    }
}