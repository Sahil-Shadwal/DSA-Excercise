package Day4;

import java.util.*;

public class BusFare {
    public static String getFare(String source, String destination) {
        source = source.toUpperCase();
        destination = destination.toUpperCase();

        String[] busStops = { "TH", "GA", "IC", "HA", "TE", "LU", "NI", "CA" };
        float[] distances = { 800, 600, 750, 900, 1400, 1200, 1100, 1500 };

        float totalDistance = 0;
        int startIndex = -1, endIndex = -1;

        for (int i = 0; i < busStops.length; i++) {
            if (source.equals(busStops[i])) {
                startIndex = i;
            }
            if (destination.equals(busStops[i])) {
                endIndex = i;
            }
        }
        if (startIndex == -1 || endIndex == -1 || startIndex == endIndex) {
            return "INVALID INPUT";
        }
        // ni=6 ha =3
        int i = (startIndex + 1) % busStops.length;
        while (i != (endIndex + 1) % busStops.length) {
            totalDistance += distances[i];
            i = (i + 1) % busStops.length;
        }

        double fare = Math.ceil(totalDistance * 0.005);
        return fare + " INR";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the source stop: ");
        String source = scanner.nextLine();

        System.out.println("Enter the destination stop: ");
        String destination = scanner.nextLine();

        String fare = getFare(source, destination);
        System.out.println("Output: " + fare);

        scanner.close();
    }
}
