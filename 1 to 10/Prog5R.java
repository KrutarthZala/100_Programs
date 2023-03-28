import java.util.Scanner;

public class Prog5R {

    static int sumDigit(int a) {

        if (a > 0) {
            return (a % 10 + sumDigit(a / 10));
        }
        else{
            return 0; //Here if return 1 then it will add 1 in final answer.
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner kz = new Scanner(System.in);

        System.out.print("Enter the number : ");
        n = kz.nextInt();

        int sd = sumDigit(n);
        System.out.print("Summation of given digit is " + sd);
        kz.close();
    }
}
