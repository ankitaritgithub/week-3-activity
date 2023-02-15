class Node2 {
    int data;
    Node2 next;

    Node2(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList2 {
    static void print(Node2 head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    static Node2 insertAtHead(Node2 head, int data) {
        Node2 temp = new Node2(data);
        temp.next = head;
        head = temp;
        return head;
    }

    static Node2 insertAtEnd(Node2 head, int data) {
        if (head == null)
            return new Node2(data);
        Node2 temp = new Node2(data);
        // temp.next = head;
        Node2 last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = temp;
        return head;
    }

    static Node2 deleteLinkedList2(Node2 head) {
        return null;
    }

    static Node2 deleteFromHead(Node2 head) {
        if (head == null) {
            System.out.println("Empty LL!! Nothing to delete");
            return null;
        }
        return head.next;
    }

    public static void main(String[] args) {
    Node2 head = new Node2(5);
    Node2 second = new Node2(6);
    head.next = second;
    Node2 third = new Node2(7);
    second.next = third;
    Node2 fourth = new Node2(8);
    third.next = fourth;
    Node2 fifth = new Node2(9);
    fourth.next = fifth;
    // System.out.println(head.data);
    // System.out.println(head.next.data);
    // System.out.println(head.next.next.data);
    // System.out.println(head.next.next.next.data);
    // System.out.println(head.next.next.next.next.data);
    while(head != null)
    {
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
    Node2 head2 = insertAtEnd(null, 1);
    print(head2);
    head2 = deleteLinkedList2(head2);
    print(head2);
    head2 = insertAtEnd(null, 1);
    print(head2);
    head2 = deleteFromHead(head2);
    print(head2);
    head2 = deleteFromHead(head2);
    }
