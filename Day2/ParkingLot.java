package Day2;

import java.util.*;

public class ParkingLot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();

        int arr[][] = new int[row][col];
        System.out.println("Enter the elements of the array (0 or 1): ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Element at [%d][%d]: ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }

        int max = 0, count = 0, index = 0;
        for (int i = 0; i < row; i++) {
            count = 0;
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                index = i + 1;
            }
        }

        System.out.println("Row " + index + " has the maximum number of full parking spaces.");
    }
}