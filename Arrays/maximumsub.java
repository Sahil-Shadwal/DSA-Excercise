import java.util.*;
public class maximumsub {
    public static int findman(int arr[]){

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        
        for(int num : arr){
            currSum += num;
            
            if (currSum > maxSum) {
                maxSum = currSum;
            }
            
            if (currSum < 0) {
                currSum = 0;
            }
        }

        return maxSum;
    }
    public static void main(String args[]){
        // int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int arr[] ={5,4,-1,7,8};
        System.out.println(findman(arr));
    }
}
