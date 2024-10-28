
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public class Practicefile {
    public static int power(int a , int n){
        // base case 
        if(n == 0){
            return 1;
        }
        return a*power(a, n-1);
    }
    public static void printNum(int n){
        if(n == 0){
            return;
        }
        printNum(n-1);
        System.out.println(n);
    }

    public static int numberOfdigits(int num){
        if(num <=9){
            return 1;
        }
        
        int count = 1+ numberOfdigits(num/10);
        return count;
    }
    public static int fibinaici(int n ){
        if(n ==1 || n ==2){
            // System.out.print(n + " ");
            return 1;
        }
        return fibinaici(n-1)+fibinaici(n-2);
    }

    // sum of array
    public static int sumofArr(int nums[] , int indx){
        if(indx == nums.length-1){
            return nums[indx];
        }

        return nums[indx] + sumofArr(nums, indx+1);
    }
    // check numbr in array
    public static boolean checkNum(int[] num , int indx , int target){
        if(indx == num.length){
            return false;
        }
        if(num[indx]== target){
            return true;
        }
        return checkNum(num, indx+1, target);
    }
    // all indices of an element present in array
    public static void allIndices(int[] num , int target , int indx){
        if(indx == num.length){
            return;
        }
        if(num[indx] == target){
            System.out.println(indx);
        }
        allIndices(num, target, indx+1);
    }
    // replace character recursively
    public static String replaceCharFn(String str , int si , String ans , char val){
        if(si == str.length()){
            return ans;
        }
        if(str.charAt(si) == val){
            ans += "X";
        }else{
            ans +=str.charAt(si);
        }
        return replaceCharFn(str, si+1, ans, val);
    }
    // remove duplicates recursively
    public static String removeDuplicate(String str , String ans, int si){
        if(si==str.length()){
            return ans;
        }
        if(!ans.contains( Character.toString(str.charAt(si)))){
            ans +=str.charAt(si);
        }
        return removeDuplicate(str, ans, si+1);

    }
    // check whether array is sorted or not
    public static boolean isSorted(int[]arr, int indx){
        if(indx==arr.length-1){
            return true;
        }
        if(arr[indx]>arr[indx+1]){
            return false;
        }
        return isSorted(arr, indx+1);

    }

    // return all the indices of target element
    public static ArrayList<Integer> allIndice(int[]arr , int indx , int target){
        ArrayList<Integer>list = new ArrayList<>();
        if(indx == arr.length){
            return list;
        }
        if(arr[indx] == target){
            list.add(indx);
        }
        ArrayList<Integer>temp = new ArrayList<>();
        temp =  allIndice(arr, indx+1, target);
        list.addAll(temp);
        return list;
    }

    // code for binary search
    public static int binarySearch(int arr[] , int si , int ei , int target){
        if(si>ei){
            return -1;
        }
        int mid = (si+ei)/2;
        if(arr[mid] == target){
            return mid;
        }else if(arr[mid]>target){
            ei = mid-1;
        }else{
            si = mid+1;
        }
        return binarySearch(arr, si, ei, target);
    }

    // search in rotated array
    public static int search(int[]arr , int target , int si , int ei){
        if(si > ei){
            return -1;
        }
        // find mid
        int mid = (si+ei)/2;
        if(arr[mid] == target){
            return mid;
        }else if(arr[si] <= arr[mid]){//left side of array is sorted
            // check whether target lies on sorted side or not
            if(target>=arr[si] && target<=arr[mid]){
                // if yes then run binary search for this part
                return binarySearch(arr, si, mid-1, target);
            }else{
                return search(arr, target, mid+1, ei);
            }
        }else{//left side of array is sorted 
            // check whether target lies on sorted side or not
            if(target>=arr[mid] && target<=arr[ei]){
                // if yes then run binary search for this part
                return binarySearch(arr, mid+1, ei, target);
            }else{
                return search(arr, target, si, mid-1);
            }
        }
    }

    // merge sort
    public static void divide(int[]arr , int si , int ei){
        if(si == ei){
            // System.out.println(arr[si]);
            return;
        }
        // divide
        int mid = (si+ei)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        // conquer
        conquer(arr, si, mid, ei);

    }
    // merging arrays
    public static void conquer(int[]arr , int si , int mid , int ei){
        int[] temp = new int[ei-si+1];
        int k =0;//iterator for temp[]
        int i =si;//iterator for left array
        int j = mid+1;//iterator right array
        while (i<=mid && j<=ei) {
            if(arr[i]<=arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        //incase some element left on left side of array
        while (i<=mid && k<temp.length) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        //incase some element left on right side of array
        while (j<=ei && k<temp.length) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        // copying the sorted array to arr
        for(k=0 , i = si; k<temp.length ; k++,i++){
            arr[i] = temp[k];
        }
    }


    // recursive function to find the subsequences
    static String[] subseq(String str){
        if(str.length()==0){
            String[] ans = {""};
            return ans;
        }
        //every element of string has two choice 1)to be the part of subsequence and 2)to not to be the part of subseq
        char c = str.charAt(0);
        String[]res1 = subseq(str.substring(1));
        String[]finalres = new String[res1.length*3];

        // copy all the element of res1 to finalres
        int k =0;
        for(int t = 0 ; t<res1.length; t++){
            finalres[k] = res1[t];
            k++;
        }
        // now append first character to all the elements of res1 and add it to finalres
        for(int t = 0 ; t<res1.length ; t++){
            finalres[k] = c+res1[t];
            k++;
        }
        // now append ASCII value of first character to all the elements of res1 and add it to finalres
        for(int t = 0 ; t<res1.length ; t++){
            int asci = c+0;
            finalres[k] = asci+res1[t];
            k++;
        }
        return finalres;
    }

    // subset with iterative approach
    static int[][] subsets(int[]arr , int si){
        if(si == arr.length){
            int[][] res = new int[1][0];//returning empty array
            return res;
        }
        // now calling subset()
        int[][]smallerOutput = subsets(arr, si+1);
        int[][]output = new int[smallerOutput.length*2][];
        // copying all the elements of smallerOutput to outpu
        int k =0;
        for(int i = 1 ; i<smallerOutput.length ; i++){
            output[k] = new int[smallerOutput[i].length];
            for(int j=0 ; j<smallerOutput[i].length; j++){
                output[i][j] = smallerOutput[i][j];
                k++;
            }
        }
        // now adding our current element to output[]
        for(int i = 0; i<smallerOutput.length;i++){
            output[k] = new int[smallerOutput[i].length+1];
            output[k][0] = arr[si];
            for(int j =1 ; j<smallerOutput[i].length+1 ; j++){
                output[k][j] = smallerOutput[i][j-1];
                k++;
            }
        }
        return output;
    }

    // permutation
    static String[] permutation(String str) {
        // if string is empty
        if(str.length() == 0) {
            String[] res = {""};
            return res;
        }
        
        // else wise
        String smallOutput[] = permutation(str.substring(1));
        String output[] = new String[str.length() * smallOutput.length];
        int k = 0;
        
        for (int i = 0; i < smallOutput.length; i++) {
            String current = smallOutput[i];
            for (int j = 0; j <= current.length(); j++) {
                output[k] = current.substring(0, j) + str.charAt(0) + current.substring(j);
                k++;
            }
        }
    
        return output;
    }

    // permutation  to print permutation
    static void permutationPrint(String str , String res){
        if(str.length() == 0){
            System.out.println(res);
            return;
        }
        //elsewise
        for(int i =0; i<str.length() ; i++){
            permutationPrint(str.substring(0, i)+str.substring(i+1) , res +str.charAt(i));
        }
        
    }
    // rat in a maze for checking whether path exist or not
    static boolean isPath(int[][]maze){
        int n = maze.length;
        int[][]path = new int[n][n];
        return pathMila(maze , path , 0 , 0);
    }
    // function that will check whether the given coordinates are valid or not and stop at destination
    static boolean pathMila(int[][]maze , int[][]path , int row , int col){
        int n = maze.length;
        // check kahi current cell hi toh destination h ya nhi 
        if(row == n-1 && col == n-1){
            return true;
        }
        // otherwise check whether the current cell valid h ya nhi 
        if(row >=n || col>=n || row<0 || col <0 || maze[row][col] == 0 || path[row][col] ==1){
            return false;
        }
        path[row][col] = 1;
        // if your current cell is valid then look for next cell
        // top
        if(pathMila(maze, path, row-1, col)){
            return true;
        }
        
        // right
        if(pathMila(maze, path, row, col+1)){
            return true;
        };

        // down
        if(pathMila(maze, path, row+1, col)){
            return true;
        }
        if(pathMila(maze, path, row+1, col)){
            return true;
        }
        // left
        if(pathMila(maze, path, row, col-1)){
            return true;
        }
        return false;
    }

    static void ratInAMazePaths(int[][]maze){
        int n = maze.length;
        int[][]path = new int[n][n];
        
        printAllPath(maze , path , 0 , 0);

    }
    static void printAllPath(int[][]maze , int[][]path , int row , int col){
        int n = maze.length;
        // check kahi current cell hi toh destination h ya nhi 
        if(row == n-1 && col == n-1){
            //if destination reached then print the path
            path[row][col] = 1;
            for (int i = 0; i < path.length; i++) {
                for (int j = 0; j < path.length; j++) {
                    System.out.print(path[i][j]);
                }
                System.out.println();
            }
            System.out.println("----------");
            return;
        }
        // otherwise check whether the current cell valid h ya nhi 
        if(row >=n || col>=n || row<0 || col <0 || maze[row][col] == 0 || path[row][col] ==1){
            return;
        }
        path[row][col] = 1;
        // now explore all the directions
        // top
        printAllPath(maze, path, row-1, col);
        // down
        printAllPath(maze, path, row+1, col);
        // leff
        printAllPath(maze, path, row, col-1);
        // right
        printAllPath(maze, path, row, col+1);
        path[row][col] = 0;
    }

    // place n queens 
    static void placeNqueens(int[][]board , int row ){
        int n = board.length;
        if(row == n){
            // print board
            System.out.println("-----------------");
            for (int i = 0; i < n; i++) {
                
                for (int j = 0; j < n; j++) {
                    System.out.print(board[i][j]);
                }
                System.out.println();
                
            }
            System.out.println("------------------");
            return;
        }
        // placing queens
        for(int j =0 ; j<n; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 1;
                placeNqueens(board, row+1);
                board[row][j] = 0;
            }
            
        }
      
    }
    // function to check whther the current cell is safe to place the queen
    static boolean isSafe(int[][]board , int row, int col){
        // check verticaly
        for (int i = row; i >=0; i--) {
            if(board[i][col]== 1){
                return false;
            }
        }
        // check left daigonaly
        for (int i = row , j=col; i >=0 && j>=0; i-- , j--) {
            if(board[i][j]== 1){
                return false;
            }
        }
        // check right daigonaly
        for (int i = row , j=col; i>=0 && j<board.length; i-- , j++) {
            if(board[i][j]== 1){
                return false;
            }
        }
        return true;
    }

    // grid ways
    static void gridWays(int n ){
       System.out.println("gridways");
        int[][]path = new int[n][n];
        printGridWays(3, path , 0 , 0);
    }
    static void printGridWays(int n , int[][]path , int row , int col){
        if(row==n-1 && col==n-1){
            // destination is reached print path
            path[row][col] = 1;
            for (int i = 0; i < path.length; i++) {
                for (int j = 0; j < path.length; j++) {
                    System.out.print(path[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
            
        }
        // check ki current cell valid h ya nhi
        if(row >=n || col>=n || row<0 || col<0 ){
            return;
        }
        // if current cell is valid then update it to path[][]
        path[row][col] = 1;
        printGridWays(n, path, row+1, col);//exploring next move as down move
        printGridWays(n, path, row, col+1);//exploring next move as right move
        path[row][col] = 0;
    }

    // place knight tour
    static void knightTour(int n){
        // System.out.println("inside knightour");
        int[][]board = new int[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = -1;
            }
        }
       System.out.println(printKnightTour(board , 0 , 0 ,0));
    //    System.out.println(Arrays.toString(board[0]));
    //    System.out.println(Arrays.toString(board[1]));
    //    System.out.println(Arrays.toString(board[2]));
    // //    System.out.println(Arrays.toString(board[3]));
    // //    System.out.println(Arrays.toString(board[4]));
    }
    static boolean printKnightTour(int[][]board , int i , int j , int move){
        // System.out.println(move);
        int n = board.length;
        // base condition
        if(move ==(n*n)){
            // print the board
            for (int k = 0; k < board.length; k++) {
                for (int k2 = 0; k2 < board.length; k2++) {
                    System.out.print(board[k][k2] + " ");
                }
                System.out.println();
            }
            System.out.println( "---------------------");
            return true;
        }

        // check whether the current cell is safe to place the knight or not
        if(i<0 || j<0 || i>=n || j>=n || board[i][j] != -1){
            return false;
        }
        board[i][j] = move;
        // now look for next move

        // two down one right
        if(printKnightTour(board, i+2, j+1 , move+1)){
            return true;
        };
        // two down one left
        if(printKnightTour(board, i+2, j-1, move+1)){
            return true;
        }
       
        // two up one right
        if (printKnightTour(board, i-2, j+1, move+1)) {
            return true;
        }
        
        // two up one left
        if(printKnightTour(board, i-2, j-1, move+1)){
            return true;
        }
       
        // two right one up
        if(printKnightTour(board, i-1, j+2, move+1)){
            return true;
        }
        // two right one down
        if(printKnightTour(board, i+1, j+2, move+1)){
            return true;
        };
        // two left one up
        if( printKnightTour(board, i-1, j-2, move+1)){
            return true;
        }
       
        // two left one down
        if(printKnightTour(board, i+1, j-2, move+1)){
            return true;
        };
        board[i][j] = -1;

        return false;

    }

    // keypad combination

    static String[] keypadComb(int num){
        if(num<=0){
            String output[] = {""};
            return output;
        }
        String[]keySeq = getCharseq(num%10);
        String[]smlOutput = keypadComb(num/10);
        String[]finalOutput = new String[smlOutput.length*keySeq.length];
        int k = 0;
      
        for (int j = 0; j < keySeq.length; j++) {
            for (int i = 0; i < smlOutput.length; i++) {
    
                finalOutput[k] = keySeq[j] + smlOutput[i];
                k++;
            }
        }
        return finalOutput;
    }

    static String[] getCharseq(int n){
        if(n <= 1 || n>=10){
            System.exit(0);
            String oupt[]= {"1or0"};
            return oupt;
        }else if(n==2){
            String[] output = {"a" , "b" , "c"};
            return output;
        }else if(n==3){
            String[] output = {"d" , "e" , "f"};
            return output;
        }else if(n==4){
            String[] output = {"g" , "h" , "i"};
            return output;
        }else if(n==5){
            String[] output = {"j" , "k" , "l"};
            return output;
        }else if(n==6){
            String[] output = {"m" , "n" , "o"};
            return output;
        }else if(n==7){
            String[] output = {"p" , "q" , "r" , "s"};
            return output;
        }else if(n==8){
            String[] output = { "t" , "u" , "v"};
            return output;
        }else{
            String[] output = {"w" , "x" , "y" , "z"};
            return output;
        }
    }
    

    public static void main(String[] args) {
        // knightTour(5);
        System.out.println(Arrays.toString(keypadComb(293)));
    }
}