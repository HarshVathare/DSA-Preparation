/************************************************************************
 Question = > Maximum Subarray using (Kadane's Algoriths)
 ************************************************************************/
public class Maximum_subarray {
    public static void main(String[] args) {
        int []arr = {-2,1,-3,4,-1,2,1,-5,4};


        int kadens = maxSubArrayBestApproch(arr);

        System.out.println(kadens);
    }

    //this is not best approch becouse time complexity => O(N) squers
    public static int findMaxSumarray(int[] arr) {
        int maxsum = 0;
        for (int i=0; i<arr.length; i++) {
            int sum = 0;
            for (int j=i; j<arr.length; j++) {
                sum = arr[i] + arr[j];
                if(maxsum < sum) {
                    maxsum = sum;
                }
            }
        }
        return maxsum;
    }

    //Time Complexity => O(n)
    public static int maxSubArrayBestApproch(int [] arr) {
        int maxsum = 0;
        int cursum = 0;

        for(int i=0; i<arr.length; i++) {
            cursum = cursum + arr[i];
            if(cursum > maxsum) {
                maxsum = cursum;
            }

            if(cursum < 0) {
                cursum = 0;
            }
        }
        return maxsum;
    }
}
