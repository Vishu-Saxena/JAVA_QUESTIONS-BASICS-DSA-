package Arrays.Practice;
import java.util.*;;

public class Q5 {
    public static void main(String[] args) {
        int nums[] = {-1,0,1 , 2 , -1,-4};
        Set<List<Integer>> resultSet = new HashSet <List <Integer>>();
        for(int i =0 ; i<nums.length-2; i++){
            for(int j =i+1 ; j<nums.length-1 ; j++){
                for(int k = j+1 ; k<nums.length ; k++){
                    if(nums[i]+ nums[j]+nums[k] == 0){
                        List <Integer> triplet  =  new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        triplet.sort(null);
                        // System.out.println(triplet);
                        resultSet.add(triplet);
                    }
                }
            }
        }
        System.out.println(resultSet);
    }
}
