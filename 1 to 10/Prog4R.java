import java.util.Scanner;

public class Prog4R {
    
    static int findFact(int a)
    {

        if (a >= 1) {
            return (a*findFact(a-1));
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner kz = new Scanner(System.in);

        System.out.println("Enter the number : ");
        n = kz.nextInt();
        
        int fact = findFact(n);
        System.out.println("Factorial of given number is "+fact);
    }
}
