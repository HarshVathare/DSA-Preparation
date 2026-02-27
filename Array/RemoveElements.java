
 /*************  27 => Remove Elements   ***********************************************************/
public class RemoveElements {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int[] nums2 = {0,1,2,2,3,4,5,2};
        int val = 2;
        int k = removeElements(nums2,val);
        System.out.println(k);
    }

    public static int removeElements(int[]nums2, int val) {
        int i = 0;

        for(int j=0; j<nums2.length; j++) {
            if(nums2[j] != val) {
                int tmp = nums2[i];
                nums2[i] = nums2[j];
                nums2[j] = tmp;
                i++;
            }
        }

         return i;
    }
}
