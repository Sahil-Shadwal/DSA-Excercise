package Arrays;
import java.util.*;
public class ratate_matrix {
    public static void rotateMat(int arr[][]){
        for(int k = 0 ; k < arr.length; k++){
            int i = 0;
            int j =arr.length-1;
            while(i < j){
                swap(arr, i,k,j,k);
                i++;
                j--;
            }

        }
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr[0].length; j++){
                swap(arr, i,j,j,i);
            }
        }
        
    }
    public static void swap(int arr[][], int i, int j, int k, int l){
        int temp = arr[i][j];
        arr[i][j] = arr[k][l];
        arr[k][l] = temp;

    }
    public static void main(String args[]){
        int arr[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        rotateMat(arr);
        System.out.println(Arrays.deepToString(arr));    }
}
