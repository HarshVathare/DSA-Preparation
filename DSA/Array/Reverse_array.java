import java.util.Scanner;
public class Reverse_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("This the array : ");
        System.out.print("Enter size of an array : ");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter array elemnts : ");
        for (int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
//This is my first commit isssss

        reverse(arr);

        System.out.print("Reverse array is : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }

    }

    public static void reverse(int arr[]){
        int sp = 0;
        int ep = arr.length-1;

        while (sp <= ep){
           int tmp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = tmp;

            sp++;
            ep--;
        }

    }
}
