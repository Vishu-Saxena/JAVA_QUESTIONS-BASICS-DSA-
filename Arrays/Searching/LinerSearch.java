package Arrays.Searching;


public class LinerSearch {

    public static int linearSearch(int num[] , int key){

        for(int i =0 ; i<num.length ; i++){
            if(num[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {3,5,1,8,10};
        int key = 10;
        int res = linearSearch(arr , key);
        System.out.println(res);

    }
}
