package Daily_2_queSolve;

public class Q6_rotate_array {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int k = 4;
         rotateArray(arr,0,arr.length-1);
         rotateArray(arr,0,k-1);
         rotateArray(arr,k,arr.length-1);
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    static void rotateArray(int[] arr, int sp, int ep){

        while (sp < ep){
            int tmp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = tmp;
            sp++;
            ep--;
        }
    }
}


/*
class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        rotateArray(nums,0,nums.length-1);
        rotateArray(nums,0,k-1);
        rotateArray(nums,k,nums.length-1);
    }

    static void rotateArray(int[] nums, int sp, int ep){
        while (sp < ep){
            int tmp = nums[sp];
            nums[sp] = nums[ep];
            nums[ep] = tmp;
            sp++;
            ep--;
        }
    }
}
 */