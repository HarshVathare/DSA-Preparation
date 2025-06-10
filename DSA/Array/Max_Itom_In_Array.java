import java.util.Scanner;

public class Max_Itom_In_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter array size : ");
        int size = in.nextInt();
        //initiolies array with values
        int[] arr = new int[size];
        //taking input
        System.out.print("Enter element : ");
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        //display array elements
        System.out.print("Your array is : ");
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }

        //calling the max function
        int maxres = maxmethod(arr);
        System.out.println();
        System.out.print("Maximum element is : "+ maxres);
    }

    static int maxmethod(int[] arr){
        int max = arr[0];
        //for iteration to all elements
        for(int i=0; i<arr.length; i++){
            if( max < arr[i] ){
                max = arr[i];
            }
        }
        return max;
    }
}
