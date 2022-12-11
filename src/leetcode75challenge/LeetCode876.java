package leetcode75challenge;

import dataStructures.ListNode;

public class LeetCode876 {

    public static ListNode middleNode(ListNode head) {
        int length = 0;
        ListNode pointer = head;
        while(pointer != null){
            length += 1;
            pointer = pointer.next;
        }
        int middle = length / 2;
        int i = 0;
        pointer = head;
        while(pointer != null){
            if(i == middle)
                break;
            i += 1;
            pointer = pointer.next;
        }
        return pointer;
    }

    public static void main(String args[]){
        int[] nodes = {1,2,3,4,5};
        ListNode head = ListNode.createLinkedList(nodes);
        System.out.println("Middle Node is : "+middleNode(head).val);
    }
}
