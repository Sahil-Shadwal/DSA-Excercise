package Arrays;
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

        // int start = 0, end = 0, tempStart = 0;

        // for (int i = 0; i < arr.length; i++) {
        //     currSum += arr[i];

        //     if (currSum > maxSum) {
        //         maxSum = currSum;
        //         start = tempStart;
        //         end = i;
        //     }

        //     if (currSum < 0) {
        //         currSum = 0;
        //         tempStart = i + 1;
        //     }
        // }

        // System.out.println("Maximum subarray: " + Arrays.toString(Arrays.copyOfRange(arr, start, end + 1)));
        // return maxSum;

        return maxSum;
    }
    public static void main(String args[]){
        // int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int arr[] ={5,4,-1,7,8};
        System.out.println(findman(arr));
    }
}
