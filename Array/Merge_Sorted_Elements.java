/************************************************************************
 Developer Name : Harshvardhan Vathare
 Developer Content : harsh1234vathare@gmail.com
 Created On : 2/27/2026 9:31 AM
 Project Name : demo
 ************************************************************************/
public class Merge_Sorted_Elements {
    public static void main(String[] args) {
        int[]nums1 = {1,2,3,0,0,0};
        int []nums2 = {2,5,6};

        int n = nums2.length;
        int m = nums1.length;

        MergeSortedElements(nums1, m, nums2, n);
    }

    public static void MergeSortedElements(int[]nums1, int m, int[]nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int ritePos = m+n-1;

        while (p2 >= 0) {
            if((p1 >= 0) && (nums1[p1] > nums2[p2])) {
                ritePos = nums1[p1];
                p1 -=1;
            }
            else {
                ritePos = nums2[p2];
                p2 -=1;
            }
            ritePos-=1;
        }

    }
}
