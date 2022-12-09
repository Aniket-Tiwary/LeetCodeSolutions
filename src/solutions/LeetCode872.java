package solutions;


import dataStructures.TreeNode;

import java.util.ArrayList;

public class LeetCode872 {

    /*
        We Traverse both the trees one by one and find all the leaves and store it in an Arraylist and then compare
        the ArrayLists and get the result.
     */
    public static ArrayList<Integer> findLeaves(TreeNode root, ArrayList<Integer> leaves){
        if(root == null)
            return leaves;
        if(root.left == null && root.right == null){
            leaves.add(root.val);
            return leaves;
        }
        findLeaves(root.left,leaves);
        findLeaves(root.right,leaves);
        return leaves;
    }

    public static boolean leafSimilar(TreeNode root1,TreeNode root2){
        return findLeaves(root1,new ArrayList<>()).equals(findLeaves(root2,new ArrayList<>()));
    }

    public static void main(String args[]){
        TreeNode root1 = TreeNode.createBST(new int[]{3,5,1,6,2,9,8,7,4});
        TreeNode root2 = TreeNode.createBST(new int[]{3,5,1,6,7,4,2,9,8});
        System.out.println("Are trees leafSimilar : " + leafSimilar(root1,root2));

    }
}
