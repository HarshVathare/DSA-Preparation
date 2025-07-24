import java.util.Arrays;
import java.util.Scanner;

public class Swapping_betweenTwoIndex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //initiolies array with values
        int [] arr = {10,20,30,40,50,60};
        System.out.println("Your array is : "+ Arrays.toString(arr));

        //Taking input from users
        System.out.print("Enter Index 1 : ");
        int index1 = in.nextInt();
        System.out.print("Enter Index 2 : ");
        int index2 = in.nextInt();

        //Calling the swap methods
        swap(arr,index1,index2);
        System.out.print("After Swapping : "+ Arrays.toString(arr));

    }
    static void swap( int[]arr, int index1, int index2){
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }
}
