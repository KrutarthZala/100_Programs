import java.util.Scanner;

public class Prog2 {
        public static void main(String[] args) {
            
            String s;
            int count=0;
            Scanner kz = new Scanner(System.in);

            System.out.println("Enter the string : ");
            s = kz.next();
            
            int fl = s.length();
            int l = fl / 2;
        
            for (int i = 0; i < l; i++) {
                if (s.charAt(i) == s.charAt(fl-1)) {
                    count++;
                }
                fl--;
            }
            
            if (count == l - 1 || count == l) {
                System.out.println("String is palindrome.");
            }
            else{
                System.out.println("String is not palindrome.");
            }
        }
}
