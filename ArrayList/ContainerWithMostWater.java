package ArrayList;

import java.util.ArrayList;

public class ContainerWithMostWater {
    // solution with O(n2) time complexity
    static int maxWater(ArrayList<Integer>list){
        int maxWatr = 0;
        for(int h1 =0 ; h1 < list.size() ; h1++){
            for (int h2 = h1+1; h2 < list.size(); h2++) {
                int curHeight = Math.min(list.get(h2), list.get(h1));
                int curWidht = h2-h1;
                int curVol = curHeight*curWidht;
                maxWatr = Math.max(maxWatr, curVol);
            }
        }
        return maxWatr;
    }

    // solution with O(n)time complexity using two pointer approach
    static int maxWaterOptimised(ArrayList<Integer> list){
        int maxWater = 0;
        int lp = 0;//left pointer
        int rp = list.size()-1; //right pointer
        while (lp<rp) {
            int curHeight = Math.min(list.get(rp),list.get(lp));
            int cirWidth = rp-lp;
            int curVol = curHeight*cirWidth;
            maxWater = Math.max(curVol, maxWater);
            if(list.get(rp) < list.get(lp)){ 
                rp--;
            }else{
                lp++;
            }

        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> hieghts = new ArrayList<>();
        hieghts.add(1);
        hieghts.add(8);
        hieghts.add(6);
        hieghts.add(2);
        hieghts.add(5);
        hieghts.add(4);
        hieghts.add(8);
        hieghts.add(3);
        hieghts.add(7);
        System.out.println(maxWater(hieghts));
        System.out.println(maxWaterOptimised(hieghts));
    }
}
