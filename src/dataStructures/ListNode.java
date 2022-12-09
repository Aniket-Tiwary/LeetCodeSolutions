package dataStructures;

public class ListNode {

    public int val;
    public ListNode next;

    public ListNode(){}

    public ListNode(int val){
        this.val = val;
    }

    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }

    public static ListNode createLinkedList(int[] nodes){
        if(nodes.length == 0)
            return null;
        ListNode head = new ListNode(nodes[0]);
        ListNode pointer = head;
        for (int i=1;i<nodes.length;i++) {
            pointer.next = new ListNode(nodes[i]);
            pointer = pointer.next;
        }
        return head;
    }

    public static void printLinkedList(ListNode head){
        while(head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

}
