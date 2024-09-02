import java.util.*;

public class CityBusFare {

    // Define the path distances in meters
    static int[] path = { 800, 600, 750, 900, 1400, 1200, 1100, 1500 };

    // Define the bus stops in the ring route
    static String[] busStops = { "TH", "GA", "IC", "HA", "TE", "LU", "NI", "CA" };

    public static int getFare(String source, String destination) {
        // Get the index of source and destination in the bus stops array
        int sourceIndex = Arrays.asList(busStops).indexOf(source);
        int destinationIndex = Arrays.asList(busStops).indexOf(destination);

        // Initialize the total distance to 0
        int totalDistance = 0;

        // Calculate distance based on the circular route
        if (sourceIndex <= destinationIndex) {
            for (int i = sourceIndex; i < destinationIndex; i++) {
                totalDistance += path[i];
            }
        } else {
            // If the destination is before the source, calculate by wrapping around
            for (int i = sourceIndex; i < path.length; i++) {
                totalDistance += path[i];
            }
            for (int i = 0; i < destinationIndex; i++) {
                totalDistance += path[i];
            }
        }

        // Calculate fare based on the distance
        double fare = (totalDistance / 1000.0) * 5;

        return (int) fare;
    }

    public static void main(String[] args) {
        // Example usage
        System.out.println("Fare from TH to IC: " + getFare("TH", "IC") + " INR");
        System.out.println("Fare from CA to HA: " + getFare("CA", "HA") + " INR");
        System.out.println("Fare from NI to HA: " + getFare("NI", "HA") + " INR");
    }
}