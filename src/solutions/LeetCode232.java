package solutions;

import dataStructures.MyQueue;

public class LeetCode232 {

    public static void main(String args[]){
        int x = 5;
        MyQueue obj = new MyQueue();
        obj.push(x);
        System.out.println("Queue generated is : " + obj.toString());
        int param_2 = obj.pop();
        System.out.println("Element popped is : " + param_2);
        obj.push(6);
        obj.push(7);
        obj.push(8);
        int param_3 = obj.peek();
        boolean param_4 = obj.empty();
        System.out.println("Queue generated is : " + obj.toString());
        System.out.println("Top element is : " + param_3);
        System.out.println("Is queue empty : " + param_4);
    }
}
