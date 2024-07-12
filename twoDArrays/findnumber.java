package twoDArrays;

public class findnumber {
    public static boolean findseven(int arr[][],int target){
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j< arr[0].length; j++){
                if(arr[i][j] == target){
                    return true;
                }

            }
        }
        return false;
    }
    public static void main(String args[]){
        int arr[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 14;
        System.out.println(findseven(arr,target));
    }
}
