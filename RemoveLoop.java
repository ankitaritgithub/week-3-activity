import java.util.*;

// class definition of the ListNode
public class RemoveLoop {
    public int val;
    public RemoveLoop next;

    public RemoveLoop(int value) {
        val = value;
        next = null;
    }

    // function to remove loop in linked list using hashing
public static void removeLoopUsingHashing(RemoveLoop head){
HashMap<RemoveLoop,Boolean> visited = new HashMap<RemoveLoop,Boolean>();
RemoveLoop temp = head; // an iterator to iterate the linked list
while (temp != null && temp.next != null && !visited.containsKey(temp.next)){
visited.put(temp, true);
temp = temp.next;
}
if (temp == null || temp.next == null){
// this means that loop is not present in the linked list
System.out.print("Loop is absent in the linked list");
System.out.print("\n");
}
else{
// the node temp->next is the starting of the loop in the linked list
// hence, we can set temp->next = NULL to remove the loop in the linked list
System.out.print("Loop found, loop is starting from the node: ");
System.out.print(temp.val);
System.out.print("\n");
temp.next = null;
System.out.print("Loop as been removed in the linked list");
System.out.print("\n");
}
}
