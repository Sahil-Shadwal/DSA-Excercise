package Day8;

import java.util.*;

public class CheckersGame {

    private static int N, M;
    private static int[][] matrix;
    private static boolean[][] visited;

    // Directions for moving up, down, left, right
    private static final int[] dx = { -1, 1, 0, 0 };
    private static final int[] dy = { 0, 0, -1, 1 };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the matrix
        N = sc.nextInt();
        M = sc.nextInt();
        matrix = new int[N][M];
        visited = new boolean[N][M];

        // Read the matrix
        for (int i = 0; i < N; i++) {
            String row = sc.next();
            for (int j = 0; j < M; j++) {
                matrix[i][j] = row.charAt(j) - '0';
            }
        }

        // List to store the sizes of all connected components
        List<Integer> componentSizes = new ArrayList<>();

        // Find all connected components
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (matrix[i][j] == 1 && !visited[i][j]) {
                    int size = dfs(i, j);
                    componentSizes.add(size);
                }
            }
        }

        // Sort the component sizes in descending order
        Collections.sort(componentSizes, Collections.reverseOrder());

        int maheshCells = 0;
        int sureshCells = 0;

        // Mahesh starts first, then Suresh, and so on
        for (int i = 0; i < componentSizes.size(); i++) {
            if (i % 2 == 0) {
                maheshCells += componentSizes.get(i);
            } else {
                sureshCells += componentSizes.get(i);
            }
        }

        // Output the number of cells captured by Suresh
        System.out.println(sureshCells);
    }

    // Depth-First Search to find the size of a connected component
    private static int dfs(int x, int y) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[] { x, y });
        visited[x][y] = true;
        int size = 0;

        while (!stack.isEmpty()) {
            int[] cell = stack.pop();
            int cx = cell[0];
            int cy = cell[1];
            size++;

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx >= 0 && nx < N && ny >= 0 && ny < M && matrix[nx][ny] == 1 && !visited[nx][ny]) {
                    stack.push(new int[] { nx, ny });
                    visited[nx][ny] = true;
                }
            }
        }

        return size;
    }
}