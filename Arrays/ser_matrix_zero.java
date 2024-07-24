package Arrays;

import java.util.Arrays;

public class ser_matrix_zero {
    public static void set(int matrix[][]){
        int rows = matrix.length;
        int cols = matrix[0].length;

        int row[] = new int[rows];
        int col[] = new int[cols];
        

        for(int i = 0; i < rows; i++ ){
            for(int j = 0; j < cols; j++){
                if(matrix[i][j] == 0){
                    row[i] = -1;
                    col[j] = -1;
                }
            }
        }
        for(int i = 0; i< rows; i++){
            for(int j =0; j < cols; j++){
                if(row[i] == -1 || col[j] == -1 ){
                    matrix[i][j] = 0;
                }
            }
        }
        
    }
    public static void main(String args[]){
    int matrix[][] = { {1, 1, 1}, {1, 0, 1}, {1, 1, 1} };
    System.out.println(Arrays.deepToString(matrix));
    set(matrix);
    System.out.println(Arrays.deepToString(matrix));

    }
}
