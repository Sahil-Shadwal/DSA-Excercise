import java.util.Scanner;

public class CityBusFare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrs = { "TH", "GA", "IC", "HA", "TE", "LU", "NI", "CA" };
        float[] arr = { 800, 600, 750, 900, 1400, 1200, 1100, 1500 };

        System.out.println("Available stations:");
        for (String station : arrs) {
            System.out.print(station + " ");
        }
        System.out.println();

        System.out.print("Enter source station: ");
        String s = scanner.next().toUpperCase();
        System.out.print("Enter destination station: ");
        String d = scanner.next().toUpperCase();

        float res = 0;
        int st = -1, ed = -1;

        for (int i = 0; i < 8; i++) {
            if (s.equals(arrs[i]))
                st = i;
            if (d.equals(arrs[i]))
                ed = i;
        }

        if (st == ed) {
            System.out.println("INVALID INPUT");
        } else {
            int i = st;
            while (i != ed) {
                i = (i + 1) % 8;
                res += arr[i];
            }
            System.out.println((int) Math.ceil(res * 0.005) + " INR");
        }

        scanner.close();
    }
}