public class YshapeLinkedList {
    // h1 is the head node of the first linked list
    // h2 is the head node of the second linked list
    static LinkedListNode h1, h2;

    static class LinkedListNode {
        int d;
        LinkedListNode nxt;

        LinkedListNode(int d) {
            this.d = d;
            nxt = null;
        }
    }

    // method for getting the point of intersection of two linked
    // lists l1 and l2
    int getIntesectionNode(LinkedListNode l1, LinkedListNode l2) {
        while (l1 != null) {
            // for each iteration of the outer loop
            // iterate nodes of the linked list l2
            // where there is a match just return the value
            LinkedListNode curr2 = l2;
            while (curr2 != null) {
                if (l1.d == curr2.d) {
                    return l1.d;
                }
                curr2 = curr2.nxt;
            }
            l1 = l1.nxt;
        }
        // returning -1 means the intersection point of
        // the given two linked lists do not exist
        return -1;
    }

    void displayNodes(LinkedListNode l1) {
        while (l1 != null) {
            System.out.print(l1.d + " ");
            l1 = l1.nxt;
        }
    }

    // main method
    public static void main(String[] args) {
        // creating an object of the class LinkedListIntersection
        YshapeLinkedList lst = new YshapeLinkedList();
        // creating the first linked list
        lst.h1 = new LinkedListNode(113);
        lst.h1.nxt = new LinkedListNode(116);
        lst.h1.nxt.nxt = new LinkedListNode(119);
        lst.h1.nxt.nxt.nxt = new LinkedListNode(115);
        lst.h1.nxt.nxt.nxt.nxt = new LinkedListNode(130);
        System.out.println("The first linked list is: ");
        lst.displayNodes(lst.h1);
        System.out.println();
        // creating the second linked list
        lst.h2 = new LinkedListNode(110);
        lst.h2.nxt = new LinkedListNode(115);
        lst.h2.nxt.nxt = new LinkedListNode(130);
        System.out.println("The second linked list is: ");
        lst.displayNodes(lst.h2);
        System.out.println();
        System.out.println(
                "The first intersection point of the linked lists is: " + lst.getIntesectionNode(lst.h1, lst.h2));
    }
}
