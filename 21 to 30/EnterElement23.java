import java.util.Scanner;

public class EnterElement23 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size : ");
        int arrSize = sc.nextInt();

        
        int [] numArr = new int[arrSize];
        
        for (int i = 0; i < arrSize; i++) {
            System.out.print("Enter "+ (i+1) +" element : ");
            numArr[i] = sc.nextInt();

        }

        System.out.print("Array before insert element : ");
        printArr(numArr);
        
        System.out.print("Enter position : ");
        int position = sc.nextInt();
        
        System.out.print("Enter element : ");
        int element = sc.nextInt();


        InsertElement ie = new InsertElement();
        ie.InsertInArray(numArr, arrSize,position,element);


        
    }
    static void printArr(int []numArr) {
        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] +" ");
        }
    }
}

class InsertElement
{
    public void InsertInArray(int[] arr, int size,int pos,int val)
    {
        size++;
        int temp;

        for (int i = 0; i < arr.length; i++) {
            if ((i+1) == pos) {
                
                int loopvar = pos - (i+1);
                while ((pos - (i+1) == loopvar)) {
                    temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                    i++;
                } //*This method is complex and it is incomplete
            
                arr[pos - 1] = val;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }

    }
}