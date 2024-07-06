package Arrays;

public class search_in_rotated_array {
    public static int search( int arr[], int target){
        //we gotta use binary search fot 0(logn) time complexity
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = (low+high )/2;
            if( arr[mid] == target){
                return mid;
            }
            if(arr[low] <= arr[mid]){
                if( arr[low] <= target && target <= arr[mid]){
                    high = mid -1;
                }
                else{
                    low = mid +1;
                }
            }else{
                if(arr[mid] <= target && target <= arr[high]){
                    low = mid +1;
                }
                else{
                    high = mid -1;
                }
            }
            
        }
        return -1;
    }
    public static void main(String args[]){{
        int target = 0;
        int target2 = 3;
        int arr[] = {4,5,6,7,0,1,2};
        int arr1[] = {4,5,6,7,0,1,2};
        System.out.println(search( arr1, target2));

    }}
}
