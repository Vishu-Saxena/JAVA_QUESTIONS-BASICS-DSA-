package Arrays.Practice;

public class Q2 {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 9;

        int start = 0 , end = arr.length-1;
        while (start <= end) {
            int mid = (start+end)/2;
            if(arr[mid] == target){
                System.out.println(mid);
                return;
            }else if(arr[mid] >= arr[start]){
                //left side of mid is sorted
                //now check the side where target can lie
                if(arr[mid] >=target && target >= arr[start]){

                    // target lies on sorted side i.e left side
                    end = mid-1;
                }else{
                    // target lies on unsorted side i.e right side
                    start = mid+1;
                }
            }else{
                // right side is sorted 
                if(arr[mid] <= target && target <= arr[end]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        System.out.println("not present in array");
    }
    
}