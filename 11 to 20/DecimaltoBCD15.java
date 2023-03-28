import java.util.*;

public class DecimaltoBCD15 {
    public static void main(String[] args) {

        int decimal;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter decimal number : ");
        decimal = sc.nextInt();

        CalculateBCD cal = new CalculateBCD();
        cal.BCD(decimal);
        // ! Output for 10,20,30 etc. is not appropriate.
    }
}

class CalculateBCD {
    int d, c,rnum, count = 0,rev = 0;

    void BCD(int num) {
        int rnum = num;

        //* This Loop for reverse number */
        while (rnum != 0) {
            int r = rnum % 10;
            rev = rev * 10 + r;
            rnum /= 10;
        }

        //* This loop for convert Decimal number to BCD */
        while (rev > 0) {
            int[] arr = new int[4];
            d = rev % 10;
            int b = d, i = 0;
            while (b > 0) {
                c = b % 2;
                arr[i] = c;
                b /= 2;
                i++;
            }
            for (int j = 3; j >= 0; j--) {
                System.out.print(arr[j]);
            }
            System.out.print(" ");
            rev /= 10;
            count++;
        }
        
    }
}