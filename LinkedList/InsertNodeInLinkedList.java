public class InsertNodeInLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node insertAtBeginning(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    static Node insertAtEnd(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        return head;
    }

    static Node insertAtPosition(Node head, int data, int position) {
        if (position == 0) {
            return insertAtBeginning(head, data);
        }

        Node current = head;

        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            return head;
        }

        Node newNode = new Node(data);
        newNode.next = current.next;
        current.next = newNode;

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

        head = insertAtBeginning(head, 5);
        head = insertAtEnd(head, 40);
        head = insertAtPosition(head, 25, 3);

        display(head);
    }
}
