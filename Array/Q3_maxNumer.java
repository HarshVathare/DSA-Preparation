package Daily_2_queSolve;

public class Q3_maxNumer {
    static int findnum(int[] arr, int max){
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [] arr = {3,4,8,6,5};
        int max = arr[0];
        System.out.println("Maximum num is : "+ findnum(arr , max));
    }
}
