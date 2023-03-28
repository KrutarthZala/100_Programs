import java.util.*;

public class SelectionSort18 {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter array size : ");
                int arrSize = sc.nextInt();

                int[] arr = new int[arrSize];

                for (int i = 0; i < arr.length; i++) {
                        System.out.print("Enter element " + (i + 1) + " : ");
                        arr[i] = sc.nextInt();
                }

                System.out.print("Array befor insertion sort : ");
                for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                }
                System.out.println();

                Selection ss = new Selection();
                ss.performSelectionSort(arr);
        }
}

class Selection {
        int minj, minx;

        void performSelectionSort(int[] arr) {
                for (int i = 0; i < arr.length; i++) {
                        minj = i;
                        minx = arr[i];
                        for (int j = i + 1; j < arr.length; j++) {
                                if (arr[j] < minx) {
                                        minj = j;
                                        minx = arr[j];
                                }
                        }
                        arr[minj] = arr[i];
                        arr[i] = minx;
                }

                System.out.print("Array after selection sort : ");

                for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
                }
        }

}