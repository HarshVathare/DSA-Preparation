public class Main {
    public static void main(String[] args) {
        int[][] arr2d = {
                {2,4,1,5,1},
                {4,2,5,4,2},
                {8,8,8,5,3},
                {5,5,5,8,4}
        };

        find2dIndex(arr2d,3);
        find2dIndexBool(arr2d,4,false);
        find2dIndexBool(arr2d,4,true);
        multipleindexInOneArray(arr2d,2);
        MaximumSumSubArray(arr2d);
    }

    public static void MaximumSumSubArray(int[][]arr){
        int max = Integer.MIN_VALUE;
        int index = -1;

        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=0;j<arr[i].length;j++){
                sum = sum + arr[i][j];
            }

            if(sum > max){
                max = sum;
                index = i;
            }
        }
        System.out.println("Maximum sum is : "+max +" & Index is : "+index);

    }

    public static void multipleindexInOneArray(int [][] arr, int target){
        //calculate the total number of elements
        int size = 0;
        for(int i=0;i<arr.length;i++){
            size = size + arr[i].length;
        }

        int[][] ans = new int[size][2];
        int k=0;

        for(int i=0;i<arr.length;i++){
            boolean found = false;
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] == target){
                    ans[k][0] = i;
                    ans[k][1] = j;
                    k++;
                }
            }
            if(found){
                break;
            }
        }
        if(k == 0){
            System.out.println("Element is not present in an array ..!");
        }else {
            for(int i=0;i<arr.length;i++){
                System.out.println("Index is : "+ans[i][0]+","+ans[i][1]);
            }
        }
    }

    public static void find2dIndexBool(int[][]arr, int target, boolean findlast){
        int outerindex = -1;
        int innerindex = -1;

        for(int i=0;i<arr.length;i++){
            boolean found = false;
            for(int j=0;j<arr[i].length;j++){
                if(target == arr[i][j]){
                    outerindex = i;
                    innerindex = j;
                    if(!findlast){
                        found = true;
                        break;
                    }
                }
            }
            if(found){
                break;
            }
        }
        System.out.println("index is : "+outerindex+","+innerindex);
    }

    public static void find2dIndex(int[][] arr, int target ){
        int outerindex = -1;
        int innerindex = -1;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(target == arr[i][j]){
                    outerindex = i;
                    innerindex = j;
                }
            }
        }
        System.out.println("index is :"+outerindex+" , "+innerindex);
    }
}
