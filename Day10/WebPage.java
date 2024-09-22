package Day10;

import java.util.*;

public class WebPage {
    // Function to find the minimum number of clicks
    public static int findMinClicks(int N, List<Integer>[] pages, int start, int end) {
        boolean[] visited = new boolean[N + 1]; // Track visited pages
        Queue<Pair> queue = new LinkedList<>(); // Queue for BFS
        queue.add(new Pair(start, 0)); // Add start page with 0 clicks

        while (!queue.isEmpty()) {
            Pair current = queue.poll(); // Dequeue the current page
            int currentPage = current.page;
            int clicks = current.clicks;
            visited[currentPage] = true;

            if (currentPage == end) { // If we reached the end page
                return clicks;
            }

            // Explore all linked pages
            for (int linkedPage : pages[currentPage]) {
                if (!visited[linkedPage]) { // Only visit unvisited pages
                    queue.add(new Pair(linkedPage, clicks + 1));
                }
            }
        }

        return -1; // Return -1 if the end page cannot be reached
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Number of web pages

        // Suppress the unchecked cast warning with proper casting
        @SuppressWarnings("unchecked")
        List<Integer>[] pages = new ArrayList[N + 1]; // Pages array

        // Initialize the list for each page
        for (int i = 1; i <= N; i++) {
            pages[i] = new ArrayList<>();
            int numLinks = scanner.nextInt(); // Number of links from the page

            for (int j = 0; j < numLinks; j++) {
                pages[i].add(scanner.nextInt()); // Add linked pages
            }
        }

        // Read start and end pages
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        // Calculate and print the result
        int result = findMinClicks(N, pages, start, end);
        System.out.println(result);
    }
}

// Custom Pair class to store page and number of clicks
class Pair {
    int page, clicks;

    public Pair(int page, int clicks) {
        this.page = page;
        this.clicks = clicks;
    }
}
