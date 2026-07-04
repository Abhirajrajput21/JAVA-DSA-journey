import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int number = 0;

        for (int i = 0; i < str.length(); i++) {
            number = number * 10 + (str.charAt(i) - '0');
        }

        System.out.println(number);

        sc.close();
    }
}
