import java.util.*;

public class BucketSort19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size : ");
        int arrSize = sc.nextInt();

        int[] arr = new int[arrSize];

        for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter element " + (i + 1) + " : ");
                arr[i] = sc.nextInt();
        }

        System.out.print("Array befor bucket sort : ");
        for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
        }
        System.out.println();

        Bucket bs = new Bucket();
        bs.performBucketSort(arr);
    }
}

class Bucket
{
    void performBucketSort(int [] arr)
    {
        int n = 10;
        int [] B = new int[n];

        for (int i = 0; i < B.length; i++) {
            B[i] = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 10)
            {
                B[arr[i]/n] = arr[i];
            }
            else
            {
                B[arr[i]%n] = arr[i];
            }
        }
        performInsertionSort(B,arr);
        
    }

    int x,j;
    void performInsertionSort(int [] B,int [] arr)
    {
        for (int i = 1; i < B.length; i++) 
        {
            x = B[i];
            j = i - 1;
            while (j >= 0 && x < B[j]) 
            {
                B[j+1] = B[j];
                j--;
            }
            B[j+1] = x;
        }

        System.out.print("Array after bucket sort : ");
        int j = 0;
        for (int i = 0; i < B.length; i++) {
            if (B[i] != 0) {
                arr[j] = B[i];
                System.out.print(arr[j]+" ");
                j++;

            }
        }

        //! Program adhuro chhe...
    }
}