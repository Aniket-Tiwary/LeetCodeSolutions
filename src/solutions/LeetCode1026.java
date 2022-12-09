package solutions;

import dataStructures.TreeNode;

public class LeetCode1026 {

    public static int helper(TreeNode root,int min,int max,int maxDiff){
        if(root == null)
            return maxDiff;
        min = Math.min(min,root.val);
        max = Math.max(max,root.val);
        maxDiff = Math.max(maxDiff,max-min);
        maxDiff = Math.max(helper(root.left,min,max,maxDiff),helper(root.right,min,max,maxDiff));
        return maxDiff;
    }


    public static int maxAncestorDiff(TreeNode root) {
        return helper(root,Integer.MAX_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE);
    }

    public static void main(String args[]){
        String[] nodes = {"8","3","10","1","6","null","14","null","null","4","7","13"};
        TreeNode root = TreeNode.createTree(nodes);
        TreeNode.printTree(root);
        System.out.println();
        System.out.println("Max Acestor Diff : " + maxAncestorDiff(root));
    }

}
