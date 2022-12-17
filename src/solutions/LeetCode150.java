package solutions;

import java.util.Stack;

public class LeetCode150 {

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
                int val1 = stack.pop();
                int val2 = stack.pop();
                if(tokens[i].equals("+"))
                    stack.push(val2+val1);
                else if(tokens[i].equals("-"))
                    stack.push(val2-val1);
                else if(tokens[i].equals("*"))
                    stack.push(val2*val1);
                else
                    stack.push(val2/val1);
            }else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();
    }

    public static void main(String args[]){
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println("Solution of expression is : "+evalRPN(tokens));
    }
}
