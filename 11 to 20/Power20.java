import java.util.*;

public class Power20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int base,power;

        System.out.print("Enter base : ");
        base = sc.nextInt();
        System.out.print("Enter power : ");
        power = sc.nextInt();

        Power p = new Power();
        int ans = p.performPower(base, power);

        System.out.print("Answer : " + ans);

    }
}

class Power
{
    int performPower(int b, int p)
    {
        int c = b;

        for (int i = 1; i <= p-1; i++) {
            int a = 0;
            for (int j = 1; j <= b; j++) {
                a += c;
            }
            c = a;
        }
        return c;
    }
}
