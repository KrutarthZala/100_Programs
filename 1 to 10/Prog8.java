import java.util.*;

public class Prog8 {
    public static void main(String[] args) {

        int n, d,ocount = 0, ecount = 0;
        Scanner kz = new Scanner(System.in);

        System.out.print("Enter the digit : ");
        n = kz.nextInt();

        while (n > 0) {
            d = n % 10;
            if (d % 2 == 0) {
                ecount++;
            } else {
                ocount++;
            }
            n /= 10;  
        }
        System.out.println("Total Odd numbers are : "+ocount);
        System.out.println("Total Even numbers are : "+ecount);

    }
}
