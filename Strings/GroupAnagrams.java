import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] strs = new String[n];

        for (int i = 0; i < n; i++) {
            strs[i] = sc.nextLine();
        }

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }

        for (ArrayList<String> group : map.values()) {
            System.out.println(group);
        }

        sc.close();
    }
}
