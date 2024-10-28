package ArrayList;

import java.util.ArrayList; 

public class PairSum {
    // using two pointers approach (array needs to be sorted for this approach)
    static boolean pairSum(ArrayList<Integer> list , int target){
        int lp = 0;
        int rp = list.size()-1;
        while (lp<rp) {
            int sum = list.get(rp)+list.get(lp);
            if(sum == target){
                return true;
            }else if(sum > target){
                rp--;
            }else{
                lp++;
            }
        }
        return false;
    }

    // pair sum for sorted but rotated array
    static boolean pairSumForRotatedArr(ArrayList<Integer>list , int target){
        // first find the pivot(the point via which the array is rotated)
        int n = list.size();
        int lp = 0;
        int rp = 0;
        for (int i = 0; i <n-1; i++) {
            if(list.get(i) > list.get(i+1)){
                rp = i;
                lp = i+1;
                break;
            }
        }
        System.out.println(lp + " " + rp);
        //now first check whether the sum is equal to target or not
        while (lp != rp) {
            int sum = list.get(rp)+list.get(lp);
            if(sum == target){
                return true;
            }else if(sum > target){
                rp = (n+rp-1)%n;
            }else{
                lp = (lp+1)%n;
            }
        } 
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(pairSum(list, 9));
        ArrayList<Integer> rotatedlist = new ArrayList<>();
        rotatedlist.add(5);
        rotatedlist.add(6);
        rotatedlist.add(1);
        rotatedlist.add(2);
        rotatedlist.add(3);
        rotatedlist.add(4);
        System.out.println(pairSumForRotatedArr(rotatedlist, 9));
  
    }
}
