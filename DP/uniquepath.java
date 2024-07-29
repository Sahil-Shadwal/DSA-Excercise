package DP;

public class uniquepath {
    public static int ways(int m , int n){
        int arr[][] = new int[m][n];
        return totalWays(arr, m ,n, 0, 0);
    }
    public static int totalWays(int arr[][], int m, int n, int i , int j){
        if(i == m-1 && j == n-1){
            return 1;
        } else if(i == m || j == n){
            return 0;
        }
        if(arr[i][j] != 0){
            return arr[i][j];
        }
        return totalWays(arr, m, n, i+1, j)+ totalWays(arr, m, n, i, j+1);
    }
    public static void main(String args[]){
        System.out.println(ways(3,7));
    }
}
