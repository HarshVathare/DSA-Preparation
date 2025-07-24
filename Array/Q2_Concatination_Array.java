package Daily_2_queSolve;

import java.util.Arrays;

/************************************************************************
 Developer Name : Harshvardhan Vathare
 Developer Content : harsh1234vathare@gmail.com
 Created On : 7/24/2025 8:52 AM
 Project Name : Daily_DSA_Practice
 ************************************************************************/
public class Q2_Concatination_Array {
    public static void main(String[] args) {
        int[]arr={1,3,2,1};
        int[] data = concatinate_array(arr);
        System.out.println(Arrays.toString(data));

    }

    static int[] concatinate_array(int []arr){
        int [] ans = new int[arr.length * 2];
        System.arraycopy(arr,0,ans,0,arr.length);
        System.arraycopy(arr,0,ans,arr.length,arr.length);
        return ans;
    }
}
