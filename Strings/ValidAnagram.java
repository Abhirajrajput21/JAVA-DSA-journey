import java.util.HashMap;
import java.util.Scanner;

public class ValidAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();

        if (s.length() != t.length()) {
            System.out.println("Not Anagram");
            return;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : t.toCharArray()) {
            if (!map.containsKey(ch)) {
                System.out.println("Not Anagram");
                return;
            }

            map.put(ch, map.get(ch) - 1);

            if (map.get(ch) == 0) {
                map.remove(ch);
            }
        }

        System.out.println(map.isEmpty() ? "Anagram" : "Not Anagram");

        sc.close();
    }
}
