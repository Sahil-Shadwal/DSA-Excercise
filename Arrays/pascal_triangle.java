package Arrays;
import java.util.*;
public class pascal_triangle {
    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> result = new ArrayList<>();
        if(numRows == 0){
            return result;
        }
        if(numRows == 1){
            // [[1]] to get a return of this format
            result.add(Arrays.asList(1));
            return result;
        }

        List<List<Integer>> prevRows = generate(numRows -1);
        List<Integer> newRow = new ArrayList<>();

        for(int i = 0; i< numRows; i++){
            newRow.add(1);
        }
        for(int i =1; i< numRows -1; i++){
            newRow.set(i, prevRows.get(numRows-2).get(i-1)+ prevRows.get(numRows-2).get(i));
        }
        prevRows.add(newRow);
        return prevRows;
    }
    public static void main(String args[]){
        // int numRows = 1;
        System.out.println(generate(10));
        // generate(1)
    }
}
