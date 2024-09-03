package Day2;

public class ArrayElementCounter {
    public static int count(int Arr[]) {
        int c = 1;
        int leftMax = Arr[0];
        for (int i = 1; i < Arr.length; i++) {
            if (Arr[i] > leftMax) {
                c++;
            }
        }
        return c;
    }

    public static void main(String args[]) {
        int Arr[] = new int[] { 7, 4, 8, 2, 9 };
        int Arr1[] = new int[] { 5, 3, 4, 5, 8, 9 };
        System.out.println(count(Arr));
        System.out.println(count(Arr1));
    }
}
