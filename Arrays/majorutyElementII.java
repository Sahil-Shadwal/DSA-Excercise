package Arrays;
import java.util.*;
public class majorutyElementII {
    public static List<Integer> majority(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(arr[num],map.getOrDefault(arr[num], 0) +1);
        }

        List<Integer> majority = new ArrayList<>();
        int threshold = arr.length/3;
        for(Map.Entry<Integer, Integer>  entry : map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            if(value > threshold){
                majority.add(key);
            }
        }
        return majority;
    }
    public static void main(String args[]){
        int arr[] = {1,1,1,2,3,4,5,4,3,2,1};
        List<Integer> result = majority(arr);
        System.out.println(result);
    }
}
