import java.util.*;

public class InsertionSort17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size : ");
        int arrSize = sc.nextInt();

        int [] arr = new int[arrSize];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element "+ (i+1) + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Array befor insertion sort : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        Insertion is = new Insertion();
        is.performInsertionSort(arr);

    }
}


class Insertion
{
    int x,j;
    void performInsertionSort(int [] arr)
    {
        for (int i = 1; i < arr.length; i++) 
        {
            x = arr[i];
            j = i - 1;
            while (j >= 0 && x < arr[j]) 
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = x;
        }

        System.out.print("Array after insertion sort : ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}