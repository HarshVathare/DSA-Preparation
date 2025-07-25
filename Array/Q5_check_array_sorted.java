package Daily_2_queSolve;

public class Q5_check_array_sorted {
    public static void main(String[] args) {
        int [] arr = {4,5,6,1,2,3};
        boolean data = sorted(arr);
        System.out.println(data);
    }

    static boolean sorted(int [] arr){
        for(int i = 1; i < arr.length; i++){
            if(arr[i] >= arr[i - 1]){

            }
            else {
                return false;
            }
        }
        return true;
    }
}
