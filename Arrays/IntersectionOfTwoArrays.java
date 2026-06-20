import java.util.HashSet;
import java.util.Scanner;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        for(int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        for(int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr1) {
            set.add(num);
        }

        HashSet<Integer> intersection = new HashSet<>();

        for(int num : arr2) {
            if(set.contains(num)) {
                intersection.add(num);
            }
        }

        System.out.println(intersection);

        sc.close();
    }
}
