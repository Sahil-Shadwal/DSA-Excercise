import java.util.*;

public class selection {
    public static void selectionsort(int arr[]){
        for(int i = 0; i< arr.length-1; i++){
            int smalll = i;
            for(int j = i +1; j < arr.length; j++){
                if(arr[j] < arr[smalll]){
                    smalll = j;
                }
            }
            
                int temp = arr[i];
                arr[i] = arr[smalll];
                arr[smalll] = temp;
            
        }
    }
    public static void main( String args[]){
        int arr[] = {3,5,2,1,9,4};
        selectionsort(arr);
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}