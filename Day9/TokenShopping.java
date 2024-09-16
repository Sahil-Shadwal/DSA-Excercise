package Day9;

import java.util.*;

class Item {
    String name;
    int cost;

    public Item(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }
}

public class TokenShopping {

    static List<String> getItemsToBuy(int n, int[] token, int[] claim, int k, List<Item> items) {
        List<String> result = new ArrayList<>();
        int maxTokens = 0;
        int startIndex = 0;

        // Find the starting index for the bumper offer
        for (int i = 0; i < n - k + 1; ++i) {
            int currentTokens = 0;
            for (int j = i; j < i + k; ++j) { // Fix the loop range here
                if (claim[j] == 0) {
                    currentTokens += token[j];
                }
            }
            if (currentTokens > maxTokens) {
                maxTokens = currentTokens;
                startIndex = i;
            }
        }

        // Calculate the total and find the items to buy
        int totalTokens = 0;
        Map<String, Integer> availableItems = new HashMap<>();

        for (int i = startIndex; i < startIndex + k; ++i) {
            if (claim[i] == 0) {
                totalTokens += token[i];
            }
        }
        for (Item item : items) {
            if (item.cost <= totalTokens) {
                availableItems.put(item.name, item.cost);
            }
        }

        // Find the minimal wastage and lexicographical smallest items
        int minimalWastage = totalTokens;
        for (Item item : items) {
            if (availableItems.containsKey(item.name)) {
                int wastage = totalTokens - availableItems.get(item.name);
                if (wastage < minimalWastage) {
                    minimalWastage = wastage;
                    result.clear();
                    result.add(item.name);
                } else if (wastage == minimalWastage) {
                    result.add(item.name);
                }
            }
        }

        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int tokens[] = new int[n];
        for (int i = 0; i < n; ++i) {
            tokens[i] = sc.nextInt();
        }

        int[] claim = new int[n];
        for (int i = 0; i < n; ++i) {
            claim[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        sc.nextLine(); // Consume the newline character
        String itemsInput = sc.nextLine();
        List<Item> items = new ArrayList<>();

        StringTokenizer tokenizer = new StringTokenizer(itemsInput, ": ");
        while (tokenizer.hasMoreTokens()) {
            String itemName = tokenizer.nextToken();
            int itemCost = Integer.parseInt(tokenizer.nextToken());
            items.add(new Item(itemName, itemCost));
        }

        List<String> result = getItemsToBuy(n, tokens, claim, k, items);

        for (String item : result) {
            System.out.println(item);
        }
    }
}