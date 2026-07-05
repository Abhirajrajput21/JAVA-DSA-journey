import java.util.Scanner;

public class LongestPalindromicSubstring {

    public static String expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() &&
               s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String longest = "";

        for (int i = 0; i < str.length(); i++) {

            String odd = expand(str, i, i);
            if (odd.length() > longest.length()) {
                longest = odd;
            }

            String even = expand(str, i, i + 1);
            if (even.length() > longest.length()) {
                longest = even;
            }
        }

        System.out.println(longest);

        sc.close();
    }
}
