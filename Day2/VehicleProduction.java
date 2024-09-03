package Day2;

import java.util.*;

public class VehicleProduction {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Total number of Vehicles : ");
        int vehicle = sc.nextInt();
        System.out.print("Enter Total number of Wheels : ");
        int wheels = sc.nextInt();

        float res = ((4 * vehicle) - wheels) / 2;
        if (vehicle < wheels && wheels > 2 & (wheels % 2 == 0)) {
            System.out.println("Total number of Two Wheeler : " + (int) res);
            System.out.println("Total number of Two Wheeler : " + (int) (vehicle - res));
        } else {
            System.out.println("Invalid output");
        }
    }
}
