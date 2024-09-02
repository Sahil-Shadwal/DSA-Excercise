
public class MaxSumSubmatrix {
    static final int N = 5;

    public static void printMaxSumSub(int[][] mat, int k) {
        if (k > N)
            return;

        // Step 1: Preprocessing
        int[][] stripSum = new int[N][N];

        // Calculate sum of strips of size k x 1
        for (int j = 0; j < N; j++) {
            int sum = 0;
            for (int i = 0; i < k; i++) {
                sum += mat[i][j];
            }
            stripSum[0][j] = sum;

            for (int i = 1; i < N - k + 1; i++) {
                sum += (mat[i + k - 1][j] - mat[i - 1][j]);
                stripSum[i][j] = sum;
            }
        }

        // Step 2: Calculate sum of sub-squares using stripSum[][]
        int maxSum = Integer.MIN_VALUE;
        int[] pos = new int[2];

        for (int i = 0; i < N - k + 1; i++) {
            int sum = 0;
            for (int j = 0; j < k; j++) {
                sum += stripSum[i][j];
            }

            if (sum > maxSum) {
                maxSum = sum;
                pos[0] = i;
                pos[1] = 0;
            }

            for (int j = 1; j < N - k + 1; j++) {
                sum += (stripSum[i][j + k - 1] - stripSum[i][j - 1]);

                if (sum > maxSum) {
                    maxSum = sum;
                    pos[0] = i;
                    pos[1] = j;
                }
            }
        }

        // Print the result matrix
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(mat[pos[0] + i][pos[1] + j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
                { 3, -4, 6, -5, 1 },
                { 1, -2, 8, -4, -2 },
                { 3, -8, 9, 3, 1 },
                { -7, 3, 4, 2, 7 },
                { -3, 7, -5, 7, -6 }
        };
        int k = 2;

        System.out.println("Maximum sum " + k + " x " + k + " matrix is:");
        printMaxSumSub(mat, k);

        k = 3;
        System.out.println("Maximum sum " + k + " x " + k + " matrix is:");
        printMaxSumSub(mat, k);
    }
}

/*
 * Find Maximum Sum Submatrix in a given matrix
 * Given a M x N matrix, calculate maximum sum submatrix of size k x k in a
 * given M x N matrix in O(M*N) time. Here, 0 < k < M, N.
 *
 * For example, consider below 5 x 5 matrix
 *
 * [ 3 -4 6 -5 1 ]
 * [ 1 -2 8 -4 -2 ]
 * [ 3 -8 9 3 1 ]
 * [ -7 3 4 2 7 ]
 * [ -3 7 -5 7 -6 ]
 *
 * If k = 2, maximum sum k x k sub-matrix is
 *
 * [ 9 3 ]
 * [ 4 2 ]
 *
 * If k = 3, maximum sum k x k sub-matrix is
 *
 * [ 8 -4 -2 ]
 * [ 9 3 1 ]
 * [ 4 2 7 ]
 */