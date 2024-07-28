package Arrays;
import java.util.*;
public class mergeintervals {
    public static int[][] merge(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();
    
        Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));
    
        for (int[] interval : intervals)
          if (ans.isEmpty() || ans.get(ans.size() - 1)[1] < interval[0])
            ans.add(interval);
          else
            ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], interval[1]);
    
        return ans.toArray(int[][] :: new);
    }
    public static void main(String args[]){
        int arr[][] = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(merge(arr)));
    }
}
