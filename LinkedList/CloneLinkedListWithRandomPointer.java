import java.util.HashMap;

public class CloneLinkedListWithRandomPointer {

    static class Node {
        int data;
        Node next, random;

        Node(int data) {
            this.data = data;
        }
    }

    static Node cloneList(Node head) {

        HashMap<Node, Node> map = new HashMap<>();

        Node current = head;

        while (current != null) {
            map.put(current, new Node(current.data));
            current = current.next;
        }

        current = head;

        while (current != null) {
            map.get(current).next = map.get(current.next);
            map.get(current).random = map.get(current.random);
            current = current.next;
        }

        return map.get(head);
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);

        head.random = head.next;
        head.next.random = head;

        Node clone = cloneList(head);

        System.out.println(clone.data);
    }
}
