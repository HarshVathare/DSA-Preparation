package date_25;

//Max consecutive once
public class Consecutive_num {
    public static void main(String[] args) {
        int [] arr = {1,0,1,1,0,1};

        find_consecutive(arr);
    }
    static void find_consecutive(int[] arr){
        int maxcount = 0;
        int current_count = 0;
        for(int i = 0; i <= arr.length-1; i++){
            if(arr[i] == 1){
                 current_count ++;//2
                 maxcount = Math.max(maxcount, current_count);
            }
            else {
               current_count = 0;
            }
        }
        System.out.println(maxcount);
    }
}
