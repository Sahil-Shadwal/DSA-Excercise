public class ArrayElementCounter {
    public static int countElements(int[] Arr) {
        if (Arr.length == 0)
            return 0;

        int count = 1; // First element is always counted
        int currentMax = Arr[0];

        for (int i = 1; i < Arr.length; i++) {
            if (Arr[i] > currentMax) {
                count++;
                currentMax = Arr[i];
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] Arr1 = { 3, 4, 5, 8, 9 };
        System.out.println(countElements(Arr1)); // Output should be 4
    }
}