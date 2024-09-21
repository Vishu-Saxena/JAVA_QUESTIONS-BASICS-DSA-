package TwoDArrays;
public class Multipliation {

    public static void multiply(int m1[][] , int m2[][]){
        // check whether given matrices are multiplicable or not
        int row1 = m1.length;
        int row2 = m2.length;
        int col1 = m1[0].length;
        int col2 = m2[0].length;

        if(col1 != row2){
            System.out.println("Matrices are not multipliable.");
            return;
        }

        int m3[][] = new int[row1][col2];

        for(int i = 0 ; i<row1 ; i++){
            for(int j = 0 ; j < col2 ; j++){
                
                for(int k = 0; k < col1; k++){ // you can use col1 as well as row2 beacuse for matrices to be multily these two needs to be equal
                    m3[i][j] += m1[i][k]*m2[k][j];
                }
            }
        }

        // printing resultant array
        for(int i = 0; i<row1 ; i++){
            for(int j =0 ; j < col2 ; j++){
                System.out.print(m3[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matric[][] = {{1,2,3},
                            {5,6,7},
                            {9,10,11}};

        int matric2[][] = {{1,2,3},
                            {5,6,7},
                            {0,0,0}};
        multiply(matric, matric2);
    }
}
