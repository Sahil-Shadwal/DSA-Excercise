package Day13;

import java.util.*;

public class Insert {
    public static int[] atBeginning(int arr[], int n, int w) {
        int[] newArr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            newArr[i + 1] = arr[i];
        }
        newArr[0] = w;
        return newArr;
    }

    public static int[] atEnd(int arr[], int n, int w) {
        int[] newArr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            newArr[i] = arr[i];
        }
        newArr[n] = w;
        return newArr;
    }

    public static int[] atAny(int arr[], int n, int a, int p) {
        int newArr[] = new int[n + 1];
        for (int i = 0; i < p; i++) {
            newArr[i] = arr[i];
        }
        for (int i = p; i < n; i++) {
            newArr[i + 1] = arr[i];
        }
        newArr[p] = a;
        return newArr;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int w = sc.nextInt(); // value to insert at the beginning
        int e = sc.nextInt(); // value to insert at the end
        int a = sc.nextInt(); // value to insert at any position
        int p = sc.nextInt(); // position for atAny insertion

        // Perform atBeginning operation
        int newArr[] = atBeginning(arr, n, w);
        System.out.println(Arrays.toString(newArr));

        // Perform atEnd operation on the updated array
        newArr = atEnd(newArr, newArr.length, e); // Corrected to use the updated array size
        System.out.println(Arrays.toString(newArr));

        // Perform atAny operation on the further updated array
        newArr = atAny(newArr, newArr.length, a, p); // Corrected to use the updated array size
        System.out.println(Arrays.toString(newArr));
    }
}
