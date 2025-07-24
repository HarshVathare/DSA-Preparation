package Daily_2_queSolve;

import java.util.Arrays;

/************************************************************************
 Developer Name : Harshvardhan Vathare
 Developer Content : harsh1234vathare@gmail.com
 Created On : 7/24/2025 7:45 AM
 Project Name : Daily_DSA_Practice
 ************************************************************************/
public class Q1_Conatins_Dublicate {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,5,2,11,11,12,12};

       boolean data = find_dublicate(arr);
       System.out.println(data);
    }

    static boolean find_dublicate(int [] arr){
        Arrays.sort(arr);
        for(int i=1; i<arr.length; i++){
            if(arr[i] == arr[i-1]){
                return true;
            }
        }
        return false;
    }
}

/* correct code is

import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums); // Sort the array
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true; // Found duplicate
            }
        }
        return false;
    }
}

2nd method by using hashset

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) {
                return true; // Duplicate found
            }
        }
        return false;
    }
}

 */

