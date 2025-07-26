package Data_26_jully;

public class Q2_Search_Insert_Position {
    public static void main(String[] args) {
        int[] nums = {1,3,5,7};
        int target = 8;
        int index = searchIndex(nums, target);
        System.out.println(index);
    }

    static int searchIndex(int [] nums, int target){
        //int insert = target;
        for(int i=0; i<nums.length; i++){
            if(nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
}

