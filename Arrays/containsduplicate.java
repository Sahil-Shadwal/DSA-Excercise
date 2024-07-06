package Arrays;

import java.util.HashSet;

public class containsduplicate {
    public static boolean duplicate(int arr[]){
        HashSet<Integer> map = new HashSet<>();
        for(int num : arr){
            if(map.contains(num)){
                return true;
            }
            else {
                map.add(num);
            }
        }
        return false;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        System.out.println(duplicate(arr));
    }
}
