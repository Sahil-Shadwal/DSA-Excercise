package Arrays;

public class trapped_rain {
    public static int trap( int[] height){
        int len = height.length;

        // left max 
        int lmax[] = new int[len];
        lmax[0] = height[0];
        for(int i = 1; i < height.length; i++){
            lmax[i] = Math.max(height[i], lmax[i-1]);
        }

        // right max 
        int rmax[] = new int[len];
        rmax[len-1] = height[len-1];
        for(int i = len-2; i >= 0; i--){
            rmax[i] = Math.max(height[i], rmax[i+1]);
        }

        int trappedWater = 0;

        // logic of finding trapped water
        for(int i = 0; i < len; i++ ){
            int trappp = Math.min(lmax[i], rmax[i]);
            trappedWater += trappp - height[i];
        }

        return trappedWater;

    }
    public static void main(String args[]){
        int height[] = {4,2,0,3,2,5};
        System.out.println(trap(height));
    }

}
