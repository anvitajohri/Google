package basic;

class ListNode {
    int val;
    ListNode next;
    
    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedListExample {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        
        // Traverse the linked list
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}