package Day10;

import java.time.*;
import java.time.format.*;
import java.util.*;

public class PrimeVilla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dye = scanner.next();
        String dwk = scanner.next();
        int h = scanner.nextInt();
        List<Integer> pre = new ArrayList<>();
        gi(365, pre);
        Map<Integer, String> dadic = new HashMap<>();
        dadic.put(0, "Mon");
        dadic.put(1, "Tue");
        dadic.put(2, "Wed");
        dadic.put(3, "Thu");
        dadic.put(4, "Fri");
        dadic.put(5, "Sat");
        dadic.put(6, "Sun");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate dyeDate = LocalDate.parse(dye, formatter);
        int das = -1;
        for (int k : pre) {
            LocalDate dte = dyeDate.plusDays(k);
            if (pr_fun(dte.getMonthValue()) && dadic.get(dte.getDayOfWeek().getValue() - 1).equals(dwk)) {
                das = k;
                break;
            }
        }
        if (das == -1) {
            System.out.print("No 0");
        } else if (das <= h) {
            System.out.print("Yes " + das);
        } else {
            System.out.print("No " + das);
        }
    }

    public static void gi(int h, List<Integer> pre) {
        for (int k = 2; k <= h; k++) {
            if (pr_fun(k)) {
                pre.add(k);
            }
        }
    }

    public static boolean pr_fun(int h) {
        if (h <= 1) {
            return false;
        }
        for (int k = 2; k < h; k++) {
            if (h % k == 0) {
                return false;
            }
        }
        return true;
    }
}