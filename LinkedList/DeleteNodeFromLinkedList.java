public class DeleteNodeFromLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node deleteFromBeginning(Node head) {
        if (head == null) {
            return null;
        }

        return head.next;
    }

    static Node deleteFromEnd(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node current = head;

        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
        return head;
    }

    static Node deleteAtPosition(Node head, int position) {
        if (head == null) {
            return null;
        }

        if (position == 0) {
            return head.next;
        }

        Node current = head;

        for (int i = 0; i < position - 1 && current.next != null; i++) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }

        return head;
    }

    static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        head = deleteFromBeginning(head);
        head = deleteFromEnd(head);
        head = deleteAtPosition(head, 1);

        display(head);
    }
}
