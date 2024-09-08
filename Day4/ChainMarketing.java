package Day4;

import java.util.*;

public class ChainMarketing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String parent = scanner.nextLine();

        String hasChildren = scanner.nextLine();

        if (hasChildren.equals("N")) {
            System.out.println("Total members: 1");
            System.out.println("Commission details");
            System.out.println(parent + ": 250 INR");
        } else {
            String children = scanner.nextLine();
            String[] childArray = children.split(",");

            System.out.println("Total members: " + (childArray.length - 1));
            System.out.println("Commission details");
            System.out.println(parent + ": " + (childArray.length * 500) + " INR");

            for (String child : childArray) {
                System.out.println(child.trim() + ":250 INR");
            }
        }
        scanner.close();
    }
}
