package solutions;

import dataStructures.TreeNode;

public class LeetCode938 {

    public static int rangeSumBST(TreeNode root,int low,int high){
        if(root == null){
            return 0;
        }
        if(root.val <= high && root.val >= low){
            return root.val + rangeSumBST(root.left,low,high) + rangeSumBST(root.right,low,high);
        }else if(root.val < low){
            return rangeSumBST(root.right,low,high);
        }else {
            return rangeSumBST(root.left,low,high);
        }
    }

    public static void main(String args[]){
        TreeNode root = TreeNode.createTree(new int[] {10,5,15,3,7,18,14});
        TreeNode.printTree(root);
        System.out.println();
        System.out.println("Result : " + rangeSumBST(root,7,15));
    }
}
