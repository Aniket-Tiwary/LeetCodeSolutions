package leetcode75challenge;

import dataStructures.ListNode;

public class LeetCode206 {

    public static ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode currentNode = head;
        ListNode prevNode = null;
        ListNode nextNode = head.next;
        while(nextNode != null){
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
            nextNode = nextNode.next;
        }
        currentNode.next = prevNode;
        return currentNode;
    }

    public static void main(String args[]){
        int[] nodes = {1,2,3,4,5,6,7,8,9};
        ListNode head = ListNode.createLinkedList(nodes);
        ListNode.printLinkedList(head);
        ListNode reversed = reverseList(head);
        ListNode.printLinkedList(reversed);
    }
}
