import java.util.*;

class Prog1
{
    public static void main(String [] args)
    {
        int n,sum=0;
        Scanner kz = new Scanner(System.in);

        System.out.print("Enter the array size : ");
        n = kz.nextInt();

        int ar[] = new int[n];

        System.out.println("Enter numbers in array : ");
        for (int i = 0; i < n; i++) {
            ar[i] = kz.nextInt();
        }

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] % 2 == 0) {
                sum += ar[i];
            }
        }
        
        System.out.println("Sum of even number in array is " + sum);
        
    }
}