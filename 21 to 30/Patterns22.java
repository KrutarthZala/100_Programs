import java.util.Scanner;

public class Patterns22 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row number : ");
        int rowNum = sc.nextInt();

        Patterns pt = new Patterns();
        System.out.println("---- Pattern 1 ----");
        pt.pattern1(rowNum);
        System.out.println("---- Pattern 2 ----");
        pt.pattern2(rowNum);
        System.out.println("---- Pattern 3 ----");
        pt.pattern3(rowNum);
    }
}

class Patterns
{
    public void pattern1(int rn)
    {
        int num = 1;
        char ch = 'A';    
        for (int row = 0; row < rn; row++) {

            for (int space = rn - row; space >  1; space--) {
                
                System.out.print(" ");
            }
        
            for (int col = 0; col <= row; col++) {
                if ((row + 1) % 2 != 0) {
                    System.out.print(num+" ");
                    num++;
                } else {
                    System.out.print(ch+" ");
                    ch++;
                }
        }
        System.out.println();
    }
    }
    public void pattern2(int rn)
    {
        for (int row = rn; row > 0; row--) {

            for (int space = row; space < rn; space++) {
                System.out.print(" ");
            }

            for (int col = 0; col < (2 * row - 1); col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void pattern3(int rn)
    {
        for (int row = rn; row > 0; row--) {

            if (row == rn) {
                int a = 2 * rn - 1;
                while (a != 0) {
                    System.out.print("*");
                    a--;
                }
                System.out.println();
            } else {
                for (int left = 0; left < row; left++) {
                    System.out.print("*");
                }
                for (int space = 1; space < 2 * (rn - row); space++) {
                    System.out.print(" ");
                }
                for (int right = 0; right < row; right++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            
        }
    }
}