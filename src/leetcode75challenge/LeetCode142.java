package leetcode75challenge;

import dataStructures.ListNode;

public class LeetCode142 {

    public static ListNode detectCycle(ListNode head) {
        ListNode fast = null;
        ListNode slow = null;
        try{
            slow = head;
            fast = head.next;
            while(fast != slow){
                slow = slow.next;
                fast = fast.next.next;
            }
        }catch(Exception ex){
            return null;
        }
        slow = slow.next;
        while(head != slow){
            head = head.next;
            slow = slow.next;
        }
        return head;
    }

    public static void main(String args[]){
        int[] nodes = {1,2,3,4,5,6};
        ListNode head = ListNode.createLinkedList(nodes);
        ListNode pointer = head;
        while(pointer.next != null){
            pointer = pointer.next;
        }
        pointer.next = head.next.next;
        System.out.println("Node where loop begins is : " + detectCycle(head).val);
    }
}
