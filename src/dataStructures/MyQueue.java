package dataStructures;

import java.util.ArrayList;

public class MyQueue {

    ArrayList<Integer> stack;
    public MyQueue() {
        this.stack = new ArrayList<>();
    }

    public void push(int x) {
        if(this.stack.size() == 0){
            this.stack.add(x);
            return;
        }
        int temp = this.pop();
        this.push(x);
        this.stack.add(temp);
        return;
    }

    public int pop() {
        if(this.stack.size() == 0){
            return 0;
        }
        int temp = this.stack.get(this.stack.size()-1);
        this.stack.remove(this.stack.size()-1);
        return temp;
    }

    public int peek() {
        return this.stack.get(this.stack.size()-1);
    }

    public boolean empty() {
        return this.stack.size() == 0;
    }

    @Override
    public String toString() {
        return "MyQueue{" +
                "stack=" + stack.toString() +
                '}';
    }
}
