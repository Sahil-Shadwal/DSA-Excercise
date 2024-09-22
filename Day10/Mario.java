package Day10;

import java.util.*;

public class Mario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        sc.nextLine();

        List<List<Character>> mat = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            String s = sc.nextLine();
            List<Character> rowList = new ArrayList<>();
            for (int j = 0; j < col; j++) {
                rowList.add(s.charAt(j));
            }
            mat.add(rowList);
        }
        int totalCoins = 0;
        int totalCalories = 0;

        for (int i = 0; i < col; i++) {
            int highestCoin = -1;
            int hurdleHeight = 0;
            boolean ringHurdle = false;

            for (int j = row - 1; j >= 0; j--) {
                char cell = mat.get(j).get(i);
                if (cell == 'C') {
                    highestCoin = Math.max(highestCoin, j);
                } else if (cell == 'H') {
                    hurdleHeight++;
                } else if (cell == '0' && hurdleHeight > 0) {
                    ringHurdle = true;
                }

            }
            if (highestCoin != -1) {
                totalCoins += highestCoin + 1;
                totalCalories += (highestCoin + 1) * 2;
            }
            if (hurdleHeight > 0) {
                if (ringHurdle) {
                    totalCalories += hurdleHeight * 2;
                } else {
                    totalCalories += hurdleHeight * 2;
                }
            }
        }
        System.out.println(totalCoins + " " + totalCalories);
    }
}
