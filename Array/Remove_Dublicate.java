/*********   26 => Remove Duplicate from sorted array            ***************************************************************/
public class Remove_Dublicate {
    public static void main(String[] args) {
        int nums[] = {0,0,1,1,1,2,2,3,3,4,5};

        int count = removeDublicates(nums);
        System.out.println("Uniqe elements : "+count);
    }

    private static int removeDublicates(int[] nums) {
        if (nums.length == 0) return 0;

        int replace = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[replace] = nums[i];
                replace++;
            }
        }

        return replace;
    }
}
