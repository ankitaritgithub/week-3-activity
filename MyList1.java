class Node1 {
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MyList1 {
    static void print(Node1 head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    static Node1 insertAtHead(Node1 head, int data) {
        Node1 temp = new Node1(data);
        temp.next = head;
        head = temp;
        return head;
    }

    static Node1 insertAtEnd(Node1 head, int data) {
        if (head == null)
            return new Node1(data);
        Node1 temp = new Node1(data);
        // temp.next = head;
        Node1 last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = temp;
        return head;
    }

    public static void main(String[] args) {
        Node1 head = new Node1(5);
        Node1 second = new Node1(6);
        head.next = second;
        Node1 third = new Node1(7);
        second.next = third;
        Node1 fourth = new Node1(8);
        third.next = fourth;
        Node1 fifth = new Node1(9);
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
        insertAtHead(head, 4);
        print(head);
        head = insertAtEnd(head, 10);
    }
}
