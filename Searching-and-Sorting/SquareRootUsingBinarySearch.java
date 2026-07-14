import java.util.Scanner;

public class SquareRootUsingBinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int left = 0;
        int right = n;
        int ans = 0;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            long square = (long) mid * mid;

            if (square == n) {
                System.out.println(mid);
                return;
            }

            if (square < n) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(ans);

        sc.close();
    }
}
