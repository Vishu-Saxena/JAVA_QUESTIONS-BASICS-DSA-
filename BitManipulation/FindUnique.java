package BitManipulation;

public class FindUnique {
    // given a array of numbers in which every number appears twice except one find that number in O(N)
    // we will use the concept of xor that is a^a=0 and a^0 = a so by doing so with all element of array all the same element will turn 0 and only number appearing once would be left
    public static void main(String[] args) {
        int[]num = {1,2,3,4,3,3,3,2,1};
        int res = 0;
        for(int i = 0; i<num.length; i++){
            res ^= num[i];
        }
        System.out.println(res);
        System.out.println((1<<2));
    }
}
