public class climbingstairs {

    public static int climbStairs(int n,int f[]){
        if(n == 0 || n == 1){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        if( f[n] != 0){
            return f[n];
        }
        f[n] = climbStairs(n-1,f) + climbStairs(n-2,f);
        return f[n];
    }
    public static void main(String args[]){
        int n = 6;
        int f[] = new int[n+1];
        System.out.print("The number of ways to climb" + n +"stairs are ");
        System.out.println(climbStairs(n,f));
    }
}
