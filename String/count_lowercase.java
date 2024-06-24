//* Count how many times lowercase vowels occured in a String entered by the user
import java.util.Scanner;

public class count_lowercase {
    // Count how many times lowercase vowels occurred in a String entered by the user
    public static int countLowercase(String name) {
        int countMai = 0;
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
            if (i <= name.length() - 3 && name.substring(i, i + 3).equals("mai")) {
                countMai++;
            }
        }
        System.out.println("Number of times 'mai' occured: " + countMai);
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String name = sc.nextLine();
        System.out.println("Number of lowercase vowels: " + countLowercase(name));

        sc.close();
    }
}

//mai ki mai se banti nahi kyuki mai, mujhe janti nahi, mai meri pehli ummed bhi aur mai mujhse door bhi mai me Mera saara sansaar bhi aur mai me hi kuch nahi mai se aahenkaar bhi aur mai mai hi shunya bhi, par mai mujhse zada nahi aur mai mujhse Kam nahi.