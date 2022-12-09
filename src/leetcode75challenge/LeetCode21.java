package leetcode75challenge;

import dataStructures.ListNode;

public class LeetCode21 {

    public static ListNode mergeTwoLists(ListNode head1, ListNode head2){
        if(head1 == null || head2 == null){
            return head1 == null ? head2 : head1;
        }
        ListNode newList = null;
        ListNode pointer1 = head1;
        ListNode pointer2 = head2;
        if(head1.val <= head2.val){
            newList = head1;
            pointer1 = pointer1.next;
        }else{
            newList = head2;
            pointer2 = pointer2.next;
        }
        ListNode newHead = newList;
        while(pointer1 != null && pointer2 != null){
            if(pointer1.val <= pointer2.val){
                newList.next = new ListNode(pointer1.val);
                newList = newList.next;
                pointer1 = pointer1.next;
            }else{
                newList.next = new ListNode(pointer2.val);
                newList = newList.next;
                pointer2 = pointer2.next;
            }
        }
        while(pointer1 != null){
            newList.next = new ListNode(pointer1.val);
            newList = newList.next;
            pointer1 = pointer1.next;
        }
        while(pointer2 != null){
            newList.next = new ListNode(pointer2.val);
            newList = newList.next;
            pointer2 = pointer2.next;
        }
        return newHead;
    }

    public static void main(String args[]){
        int[] nodesEven = {1,3,5,7};
        int[] nodesOdd = {2,4,6,8,10,12,13};
        ListNode headEven = ListNode.createLinkedList(nodesEven);
        ListNode headOdd = ListNode.createLinkedList(nodesOdd);
        ListNode.printLinkedList(headEven);
        ListNode.printLinkedList(headOdd);
        ListNode merged = mergeTwoLists(headEven,headOdd);
        ListNode.printLinkedList(merged);
    }
}
