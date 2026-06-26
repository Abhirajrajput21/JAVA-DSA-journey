import java.util.Scanner;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String result = str.replaceAll("\\s", "");

        System.out.println(result);

        sc.close();
    }
}
