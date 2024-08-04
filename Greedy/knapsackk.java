package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class knapsackk {

    public static class Item {
        int value, weight;
        double ratio;

        public Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
            this.ratio = (double) value / weight;
        }
    }

    public static double getMaxValue(int[] value, int[] weight, int n, int w) {
        Item[] items = new Item[n];
        for (int i = 0; i < n; i++) {
            items[i] = new Item(value[i], weight[i]);
        }

        Arrays.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return Double.compare(o2.ratio, o1.ratio);
            }
        });

        double totalValue = 0.0;
        for (Item item : items) {
            if (w == 0)
                break;

            if (item.weight <= w) {
                w -= item.weight;
                totalValue += item.value;
            } else {
                totalValue += item.ratio * w;
                w = 0;
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {
        int n = 3;
        int w = 50;
        int[] value = { 60, 100, 120 };
        int[] weight = { 10, 20, 30 };

        System.out.println("Maximum value in knapsack = " + getMaxValue(value, weight, n, w));
    }
}