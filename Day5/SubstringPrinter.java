package Day5;

public class SubstringPrinter {

    // Function to print all substrings
    public static void printSubstrings(String str, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }

    public static void main(String[] args) {
        String str = "abcd";
        printSubstrings(str, str.length());
    }
}