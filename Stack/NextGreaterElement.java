import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

    public static int[] findNextGreater(int[] arr) {

        int n = arr.length;
        int[] result = new int[n];

        Stack<Integer> stack = new Stack<>();

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {

            // Remove elements that cannot be the answer
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // If stack is empty, no greater element exists
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            // Current element becomes a candidate
            stack.push(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {4, 5, 2, 10, 8};

        int[] result = findNextGreater(arr);

        System.out.println("Next Greater Elements:");
        System.out.println(Arrays.toString(result));
    }
}
