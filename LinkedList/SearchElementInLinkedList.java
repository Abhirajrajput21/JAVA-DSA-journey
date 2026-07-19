public class SearchElementInLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static int search(Node head, int target) {
        int position = 0;

        while (head != null) {
            if (head.data == target) {
                return position;
            }

            head = head.next;
            position++;
        }

        return -1;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        int target = 30;

        System.out.println(search(head, target));
    }
}
