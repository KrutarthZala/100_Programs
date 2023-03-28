import java.util.Scanner;

public class Prog9 {
    public static void main(String[] args) {
        int n, a;
        Scanner kz = new Scanner(System.in);

        System.out.print("Enter the number : ");
        n = kz.nextInt();
        a = n;
        /*
         * 5        10
         * 5-2=3    10-2=8
         * 3-2=1    8-2=6
         * 7        6-2=4
         * 7-2=5    4-2=2
         * 5-2=3    2-2=0 
         * 3-2=1
         */
        for (int i = 1; i <= n/2; i++) {
            a -= 2;
        }
        if (a == 0) {
            System.out.println("Number is even.");
        }
        else{
            System.out.println("Number is odd.");
        }

    }
}
