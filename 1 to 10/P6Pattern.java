import java.util.Scanner;

public class P6Pattern {
    public static void main(String[] args) {
        int n;
        Scanner kz = new Scanner(System.in);

        System.out.print("Enter row number : ");
        n = kz.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
}
