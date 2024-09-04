package Day3;

import java.util.*;

public class BalloonOddCount {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of balloons (N) : ");
        int N = sc.nextInt();
        sc.nextLine();

        String[] balloons = new String[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Enter the " + (i + 1) + " color of balloon " + ":");

            balloons[i] = sc.nextLine();
        }

        Map<String, Integer> balloonCount = new HashMap<>();
        for (String balloon : balloons) {
            balloonCount.put(balloon, balloonCount.getOrDefault(balloon, 0) + 1);
        }

        String result = "None";
        for (Map.Entry<String, Integer> entry : balloonCount.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                result = entry.getKey();
                break;
            }
        }

        System.out.println("The color of the balloon present an odd number of times is: " + result);

        sc.close();
    }
}
