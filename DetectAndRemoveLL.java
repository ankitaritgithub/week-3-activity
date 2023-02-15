import java.util.*;

class DetectAndRemoveLL {
    static Node6 head;

    static class Node6 {
        int data;
        Node6 next;

        Node6(int d) {
            data = d;
            next = null;
        }
    }

    static public void push(int new_data) {
        Node6 new_node = new Node6(new_data);
        new_node.next = head;
        head = new_node;
    }

    void printList(Node6 node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    static boolean removeLoop(Node6 h) {
        HashSet<Node6> s = new HashSet<Node6>();
        Node6 prev = null;
        while (h != null) {
            if (s.contains(h)) {
                prev.next = null;
                return true;
            } else {
                s.add(h);
                prev = h;
                h = h.next;
            }
        }
        return false;
    }

    /* Driver program to test above function */
    public static void main(String[] args) {
        DetectAndRemoveLL llist = new DetectAndRemoveLL();
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);
        llist.head.next.next.next.next = llist.head;
        if (removeLoop(head)) {
            System.out.println("Linked List after removing loop");
            llist.printList(head);
        } else
            System.out.println("No Loop found");
    }

}