public class IntersectionOfTwoLinkedLists {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node getIntersection(Node headA, Node headB) {
        Node p1 = headA;
        Node p2 = headB;

        while (p1 != p2) {
            p1 = (p1 == null) ? headB : p1.next;
            p2 = (p2 == null) ? headA : p2.next;
        }

        return p1;
    }

    public static void main(String[] args) {

        Node common = new Node(30);
        common.next = new Node(40);

        Node headA = new Node(10);
        headA.next = new Node(20);
        headA.next.next = common;

        Node headB = new Node(15);
        headB.next = common;

        Node intersection = getIntersection(headA, headB);

        if (intersection != null)
            System.out.println(intersection.data);
        else
            System.out.println("No Intersection");
    }
}
