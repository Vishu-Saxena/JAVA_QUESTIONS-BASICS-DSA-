package Arrays;

public class TrappedWater {

    public static int trappedWater(int height[]){
        int n = height.length;
        // creating left max array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1 ; i<n ; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        // creating right max arrray
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2 ; i>=0 ; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        // calculating trapped water
        int toatalWater = 0;
        for(int i =0 ;  i<n ; i++){
            int waterTraped = (Math.min(rightMax[i], leftMax[i]) - height[i])*1;//here multiplying with 1 as widht given in question is 1;
            if(waterTraped >=0){
                toatalWater = toatalWater+waterTraped;
            }
        }

        return toatalWater;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trappedWater(height));
    }
}
