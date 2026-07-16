import java.util.Scanner;

public class AllocateBooks {

    static boolean canAllocate(int[] pages, int students, long maxPages) {
        int count = 1;
        long currentPages = 0;

        for (int page : pages) {
            if (currentPages + page <= maxPages) {
                currentPages += page;
            } else {
                count++;
                currentPages = page;
            }
        }

        return count <= students;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int students = sc.nextInt();

        int[] pages = new int[n];
        long low = 0;
        long high = 0;

        for (int i = 0; i < n; i++) {
            pages[i] = sc.nextInt();
            low = Math.max(low, pages[i]);
            high += pages[i];
        }

        long answer = high;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (canAllocate(pages, students, mid)) {
                answer = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println(answer);

        sc.close();
    }
}
