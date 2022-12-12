package leetcode75challenge;

import dataStructures.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode102 {

    public static void helper(TreeNode root,List<List<Integer>> res,int height){
        if(root == null)
            return;
        if(height == res.size())
            res.add(new LinkedList<Integer>());
        res.get(height).add(root.val);
        helper(root.left,res,height+1);
        helper(root.right,res,height+1);
        return;
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        helper(root,res,0);
        return res;
    }

    public static void main(String args[]){
        String[] nodes = {"3","9","20","null","null","15","7"};
        TreeNode root = TreeNode.createTree(nodes);
        System.out.println("Level Order Traversal : "+levelOrder(root));

    }
}
