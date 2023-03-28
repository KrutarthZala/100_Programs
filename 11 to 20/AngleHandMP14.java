import java.util.*;

public class AngleHandMP14 {
    public static void main(String[] args) {
        int h, m, angle;
        Scanner kz = new Scanner(System.in);

        System.out.print("Enter hour : ");
        h = kz.nextInt();
        System.out.print("Enter minute : ");
        m = kz.nextInt();

        if (h == 12) {
            angle = m * 6;
        } else {
            angle = (h * 5 - m) * 6;
            ////  if m = 0 then angle calculate clockwise direction.
            ////  if m = 60 then angle calculate anticlockwise direction.
        }
        System.out.print("Angle between given hour and minute hand is " + Math.abs(angle) + " degree.");

    }
}
