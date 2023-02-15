class Node3 {
    int data;
    Node3 next;

    Node3(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList3 {
    static void print(Node3 head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    static Node3 insertAtHead(Node3 head, int data) {
        Node3 temp = new Node3(data);
        temp.next = head;
        head = temp;
        return head;
    }

    static Node3 insertAtEnd(Node3 head, int data) {
        if (head == null)
            return new Node3(data);
        Node3 temp = new Node3(data);
        // temp.next = head;
        Node3 last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = temp;
        return head;
    }

    static Node3 deleteLinkedList3(Node3 head) {
        return null;
    }

    static Node3 deleteFromHead(Node3 head) {
        if (head == null) {
            System.out.println("Empty LL!! Nothing to delete");
            return null;
        }
        return head.next;
    }

    static void findMiddleElement(Node3 head) {
        int len = 0;
        Node3 temp = head;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        temp = head;
        for (int i = 0; i < len / 2; i++) {
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    static void findMiddleElementOld(Node3 head) {
        Node3 slow = head;
        Node3 fast = head;
        while (fast.next != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println(slow.data);
    }

    public static void main(String[] args) {
        Node3 head = new Node3(5);
        Node3 second = new Node3(6);
        head.next = second;
        Node3 third = new Node3(7);
        second.next = third;
        Node3 fourth = new Node3(8);
        third.next = fourth;
        Node3 fifth = new Node3(9);
        fourth.next = fifth;
        // System.out.println(head.data);
        // System.out.println(head.next.data);
        // System.out.println(head.next.next.data);
        // System.out.println(head.next.next.next.data);
        // System.out.println(head.next.next.next.next.data);
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
        System.out.println(head);
        print(head);
        print(head);
        head = insertAtHead(head, 4);
        print(head);
        head = insertAtEnd(head, 10);
        print(head);
        Node3 head2 = insertAtEnd(null, 1);
        print(head2);
        head2 = deleteLinkedList3(head2);
        print(head2);
        head2 = insertAtEnd(null, 1);
        print(head2);
        head2 = deleteFromHead(head2);
        print(head2);
        head2 = deleteFromHead(head2);
        findMiddleElement(head);
        head = insertAtEnd(head, 11);
        print(head);
        findMiddleElement(head);
        findMiddleElementOld(head);
    }

}