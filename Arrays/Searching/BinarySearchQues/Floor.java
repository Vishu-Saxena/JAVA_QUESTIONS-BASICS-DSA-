package Arrays.Searching.BinarySearchQues;

public class Floor {

    private static int floor(int[]nums , int target){
        int start = 0;
        int end = nums.length-1;
        while (start<=end) {
            int mid = start+(end-start)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        int[]nums = {1,2,3,4};
        System.out.println(floor(nums, 5));
    }
}