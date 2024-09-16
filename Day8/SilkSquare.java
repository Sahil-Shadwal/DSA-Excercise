import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SilkSquare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] ar = new int[N][2];
        for (int i = 0; i < N; i++) {
            ar[i][0] = scanner.nextInt();
            ar[i][1] = scanner.nextInt();
        }
        System.out.println(fun(N, ar));
    }

    public static int fun(int n, int[][] arr) {
        if (n < 3) {
            return 4 - n;
        } else if (n == 3) {
            if (isEquidistant(arr[0], arr[1], arr[2])) {
                return 1;
            } else {
                return 2;
            }
        } else {
            List<int[][]> arrr = generateCombinations(arr, 4);
            for (int[][] combination : arrr) {
                if (isSquare(combination[0], combination[1], combination[2], combination[3])) {
                    return 0;
                }
            }
            arrr = generateCombinations(arr, 3);
            for (int[][] combination : arrr) {
                if (isEquidistant(combination[0], combination[1], combination[2])) {
                    return 1;
                }
            }
        }
        return 2;
    }

    public static boolean isSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int d2 = distSq(p1, p2);
        int d3 = distSq(p1, p3);
        int d4 = distSq(p1, p4);

        if (d2 == 0 || d3 == 0 || d4 == 0) {
            return false;
        }
        if (d2 == d3 && 2 * d2 == d4 && 2 * distSq(p2, p4) == distSq(p2, p3)) {
            return true;
        }
        if (d3 == d4 && 2 * d3 == d2 && 2 * distSq(p3, p2) == distSq(p3, p4)) {
            return true;
        }
        if (d2 == d4 && 2 * d2 == d3 && 2 * distSq(p2, p3) == distSq(p2, p4)) {
            return true;
        }
        return false;
    }

    public static boolean isEquidistant(int[] p1, int[] p2, int[] p3) {
        int d1 = distSq(p1, p2);
        int d2 = distSq(p2, p3);
        int d3 = distSq(p1, p3);
        return d1 == d2 && d2 == d3;
    }

    public static List<int[][]> generateCombinations(int[][] arr, int r) {
        List<int[][]> combinations = new ArrayList<>();
        int[] indices = new int[r];
        generateCombinations(arr, indices, 0, arr.length - 1, 0, r, combinations);
        return combinations;
    }

    public static void generateCombinations(int[][] arr, int[] indices, int start, int end, int index, int r,
            List<int[][]> combinations) {
        if (index == r) {
            int[][] combination = new int[r][2];
            for (int i = 0; i < r; i++) {
                combination[i] = arr[indices[i]];
            }
            combinations.add(combination);
            return;
        }

        for (int i = start; i <= end && end - i + 1 >= r - index; i++) {
            indices[index] = i;
            generateCombinations(arr, indices, i + 1, end, index + 1, r, combinations);
        }
    }

    public static int distSq(int[] p, int[] q) {
        return (p[0] - q[0]) * (p[0] - q[0]) + (p[1] - q[1]) * (p[1] - q[1]);
    }
}