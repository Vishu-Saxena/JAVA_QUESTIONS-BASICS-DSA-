package TwoDArrays;

public class SearchInSortedMatrix {
    public static void search(int arr[][] , int key){
        int row = 0 ;
        int col = arr[0].length -1;
        while (row < arr.length && col > 0) {
            if(arr[row][col] == key){
                System.out.println("( "+ row + " , " + col + ")");
                return;
            }else if(arr[row][col] > key){ 
                // moving left
                col--;
            }else{
                // moving down
                row++;
            }
        }
        System.out.println("Key not found!");
    }
    public static void main(String[] args) {
        int matric[][] = {{1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12}};
        search(matric, 10);
    }
}
