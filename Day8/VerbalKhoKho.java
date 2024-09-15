package Day8;

import java.util.*;

public class VerbalKhoKho {

    public static int under(int nof, int arr[]) {
        int input = arr[0];
        int ans = nof - 1;
        for (int i = 1; i < nof; i++) {
            if (arr[i] == input) {
                ans--;

            }
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int nof = sc.nextInt();
        int arr[] = new int[nof];

        for (int i = 0; i < nof; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(under(nof, arr));
    }

}
