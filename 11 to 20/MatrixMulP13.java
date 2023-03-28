import java.util.*;

public class MatrixMulP13 {
    public static void main(String[] args) {
        Scanner kz = new Scanner(System.in);
        int d1, d2, d3, d4, sum = 0;

        System.out.print("Enter first matrix dimension : ");
        d1 = kz.nextInt();
        d2 = kz.nextInt();

        System.out.print("Enter second matrix dimension : ");
        d3 = kz.nextInt();
        d4 = kz.nextInt();

        if (d2 == d3) { // Check the dimension for matrix multiplication.

        } else {
            System.out.print("Enter correct dimension.");
            System.exit(sum); // This statement is to terminate the program.
        }
        int m1[][] = new int[d1][d2];
        int m2[][] = new int[d3][d4];
        int m3[][] = new int[d2][d2];

        System.out.println("-----MATRIX 1-----");
        for (int i = 0; i < d1; i++) {
            for (int j = 0; j < d2; j++) {
                System.out.print("Element " + i + " " + j + " is ");
                m1[i][j] = kz.nextInt();
            }
        }
        for (int i = 0; i < d1; i++) {
            for (int j = 0; j < d2; j++) {
                System.out.print(m1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-----MATRIX 2-----");
        for (int i = 0; i < d3; i++) {
            for (int j = 0; j < d4; j++) {
                System.out.print("Element " + i + " " + j + " is ");
                m2[i][j] = kz.nextInt();
            }
        }
        for (int i = 0; i < d3; i++) {
            for (int j = 0; j < d4; j++) {
                System.out.print(m2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-----Multiplication of given two matrix-----");
        for (int i = 0; i < d1; i++) {
            for (int j = 0; j < d4; j++) {
                for (int k = 0; k < d3; k++) {
                    sum += m1[i][k] * m2[k][j];
                }
                m3[i][j] = sum;
                sum = 0;
            }
        }
        for (int i = 0; i < d1; i++) {
            for (int j = 0; j < d4; j++) {
                System.out.print(m3[i][j] + " ");
            }
            System.out.println();
        }

    }
}
