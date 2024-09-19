package TwoDArrays;

public class Practice {
    
    public static void seven(int arr[][]){
        int count = 0;
        for(int i[] : arr){
            for(int j : i){
                if(j == 7){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void sumOfSecondRow(int arr[][]){
        int sum = 0;
        int row[] = arr[1];
        for(int i : row){
            sum +=i;
        }
        System.out.println(sum);
    }

    public static void printMatric(int matric[][]){
        for(int i = 0 ; i<matric.length ; i++){
            for(int j = 0 ; j < matric[0].length ; j++){
                System.out.print(matric[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void transpose(int arr[][]){
        int row = arr.length;
        int col = arr[0].length;
        int trans[][] = new int[col][row];
        for(int i = 0 ; i<row ; i++){
            for(int j =0 ; j<col ; j++){
                trans[j][i] = arr[i][j];
            }
        }
        printMatric(trans);
    }

    public static void main(String[] args) {
        int arr[][] = {{4,7} , {8,8} , {1,4}};
        // seven(arr);
        // sumOfSecondRow(arr);
        transpose(arr);
    }
    
}
