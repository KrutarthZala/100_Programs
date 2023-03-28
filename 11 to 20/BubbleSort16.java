import java.util.*;

public class BubbleSort16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size : ");
        int arrSize = sc.nextInt();

        int [] arr = new int[arrSize];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element "+ (i+1) + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Array befor bubble sort : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        Bubble bs = new Bubble();
        bs.performBubbleSort(arr);
    }
}

class Bubble
{
    void performBubbleSort(int [] arr)
    {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.print("Array after bubble sort : ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
