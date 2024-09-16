package Day10;

import java.util.*;

class Gear {
    int x, y, rr;

    public Gear(int x, int y, int rr) {
        this.x = x;
        this.y = y;
        this.rr = rr;
    }
}

public class GearRotation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        Gear[] gears = new Gear[N];

        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int rr = scanner.nextInt();
            gears[i] = new Gear(x, y, rr);
        }

        double rotation = findGearRotation(N, gears);

        if (rotation == -1) {
            System.out.println("Could Not Process");
        } else {
            System.out.printf("%.2f%n", rotation);
        }
    }

    private static double findGearRotation(int N, Gear[] gears) {
        double[] rotations = new double[N];
        rotations[0] = 1.0; // Gear 1 always rotates once

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                double n1 = rotations[i];
                double r1 = gears[i].rr;
                double r2 = gears[j].rr;

                double n2 = (n1 * r1) / r2;
                rotations[j] += n2;

                if (j == N - 1) {
                    // Check if Gear 1 and Gear N rotate in the same direction
                    if ((rotations[i] > 0 && rotations[j] > 0) || (rotations[i] < 0 && rotations[j] < 0)) {
                        return rotations[j];
                    } else {
                        return -1; // Gear 1 and Gear N rotate in opposite directions
                    }
                }
            }
        }

        return -1; // Gear chain not found between Gear 1 and Gear N
    }
}