import java.util.*;

public class ArmstrongNumP11 {
    public static void main(String[] args) {
        int n, d,mul, sum = 0, a,b, count = 0 ;
        Scanner kz = new Scanner(System.in);

        System.out.print("Enter the number : ");
        n = kz.nextInt();
        a = n;
        b = n;

        //* This loop is for count digits of number
        while (a > 0) {
            d = a % 10;
            a /= 10;
            count++;
        }

        //* This loop for check given number is armstrong or not
        while (b != 0) {
            d = b % 10;
            mul = 1;
            for (int i = 0; i < count; i++) {
                mul *= d;
            }
            b /= 10;
            sum += mul;
            
        }

        System.out.println(count);
        if (n == sum) {
            System.out.println("Number is armstrong.");
        } else {
            System.out.println("Number is not armstrong.");
        }
    }
}
