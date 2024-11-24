package Arrays.sorting;

import java.util.Arrays;

public class CycelSort {

    public static void cycleSort(int[]nums){
        // int i=0;
        // while (i<nums.length) {
        //     int correctIndx = nums[i]-1;
        //     if(nums[correctIndx] != nums[i]){
        //         // swap
        //         int temp = nums[correctIndx];
        //         nums[correctIndx] = nums[i];
        //         nums[i] = temp;
        //     }else{
        //         i++;
        //     }
        // }

        int i=0;
        int count=0;
        while(i<nums.length){
            int correctIndex = nums[i]-1;
            if(nums[i]==nums[correctIndex]){
                i++;
            }else{
                // swap
                count++;
                int temp = nums[i];
                nums[i]=nums[correctIndex];
                nums[correctIndex]=temp;

            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[]nums = {5,4,1,2,3};
        cycleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
