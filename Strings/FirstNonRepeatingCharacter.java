import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        boolean found = false;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No non-repeating character");
        }

        sc.close();
    }
}
