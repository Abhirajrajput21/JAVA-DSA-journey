import java.util.Scanner;

public class SearchInNearlySortedArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int left = 0, right = n - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                System.out.println(mid);
                return;
            }

            if (mid > left && arr[mid - 1] == target) {
                System.out.println(mid - 1);
                return;
            }

            if (mid < right && arr[mid + 1] == target) {
                System.out.println(mid + 1);
                return;
            }

            if (arr[mid] > target) {
                right = mid - 2;
            } else {
                left = mid + 2;
            }
        }

        System.out.println(-1);

        sc.close();
    }
}
