package Arrays.Searching.BinarySearchQues;

import Arrays.Searching.BinarySearch;

public class SearchInInfinitarr {

    public static int search(int[]nums , int target){
        // step one is to find the range
        int s = 0;
        int e =1;
        while (target > nums[e]) {
            int temp = e+1;
            e = e + (e-s+1)*2;
            s = temp;
            System.out.println("start " +  s + " end " + e);
        }
        // once you get the range apply binary search
        return BinarySearch.binarySearch(nums, target, s , e);
    }


    public static void main(String[] args) {
        int[]nums = {1,2,3,4,5,6,7,8,9,10,11,12};
        System.out.println(search(nums, 5));
    }
}
