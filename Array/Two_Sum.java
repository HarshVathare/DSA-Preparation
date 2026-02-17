public class Two_Sum {
    public static void main(String[] args) {
        int [] nums = {2,5,1,8};
        int n = nums.length;
        int t = 9;

       int[]result = TwoSum(nums, t, n);

       if(result != null) {
           System.out.println("[ "+result[0]+", "+result[1]+" ]");
       }
       else {
           System.out.println("no pairs");
       }
    }

    public static int[] TwoSum(int[] nums, int t, int n) {
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
               if(nums[i] + nums[j] == t) {
                    return new int[]{i,j};
               }
            }
        }
        return null;
    }
}
