package Daily_2_queSolve;

import java.util.Arrays;

public class Q4_find_sSmal_sLargNum {
     private void getElement(int[] arr, int length){
         if( length == 0 || length == 1 ){
             System.out.print(-1);
             System.out.print("");
             System.out.print(-1);
         }

         Arrays.sort(arr); // 1,2,4,5,7,7
         int small = arr[1];
         int large = arr[length - 2];
         System.out.println("Smallest number is : "+ small);
         System.out.println("Largest number is : "+ large);
     }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 7, 5};
        int length = arr.length;
        Q4_find_sSmal_sLargNum ge = new Q4_find_sSmal_sLargNum();
        ge.getElement(arr, length);
    }
}
