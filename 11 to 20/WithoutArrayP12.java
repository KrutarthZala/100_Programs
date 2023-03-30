import java.util.*;

public class WithoutArrayP12 {
    public static void main(String[] args) {
        Scanner kz = new Scanner(System.in);
        int n, a,max,min, sum = 0;



        System.out.print("Enter total numbers : ");
        n = kz.nextInt();
        max = n ;
        min = n ;

        for (int i = 0; i < n; i++) {
           
            System.out.print("Enter number "+ (i + 1) +" : ");
            a = kz.nextInt();
            
            //* This if statement is for find maximum number.
            if ( max < a){
                max = a;
            }

            if(a < min){
                min = a;
            }
                                
            sum += a;
    }
    
        System.out.println("Maximum number is : "+max);
        System.out.println("Minimum number is : "+min);

        float avg = sum / n;
        System.out.print("Average of given numbers is " + avg);

    }
}
