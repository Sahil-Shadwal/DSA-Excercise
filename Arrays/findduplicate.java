package Arrays;

public class findduplicate {
    public static int findDup(int arr[]){
        boolean n[] = new boolean[arr.length];
        for(int num : arr){
            if(n[num] == true  ){
                return num;
            }else{
                n[num] = true;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = { 1, 2 , 3, 4, 1};
        System.out.println(findDup(arr));
    }
}
