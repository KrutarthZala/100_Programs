import java.util.*;

public class Prog3R {

    static int count = 1;
    static void facNum(int a)
    {
        
        if (count <= a) {
            if (a % count == 0) {
                System.out.print(count + " ");   
            }
            count++;
            facNum(a);
        }
    }    
    public static void main(String[] args) {
        int n;
        Scanner kz = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = kz.nextInt();

        System.out.print("Factors are : ");
        facNum(n);
    }
}
