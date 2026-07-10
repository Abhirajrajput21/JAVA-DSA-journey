import java.util.Scanner;

public class CountOccurrences {

    static int firstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1, ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] >= target) {
                if (arr[mid] == target) ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    static int lastOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1, ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] <= target) {
                if (arr[mid] == target) ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int first = firstOccurrence(arr, target);
        int last = lastOccurrence(arr, target);

        if (first == -1)
            System.out.println(0);
        else
            System.out.println(last - first + 1);

        sc.close();
    }
}
