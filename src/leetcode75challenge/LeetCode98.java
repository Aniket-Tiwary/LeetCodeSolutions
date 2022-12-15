package leetcode75challenge;

import com.sun.source.tree.Tree;
import dataStructures.TreeNode;

import java.util.ArrayList;

public class LeetCode98 {

    public static void preOrder(TreeNode node, ArrayList<Integer> nodes){
        if(node == null)
            return;
        preOrder(node.left,nodes);
        nodes.add(node.val);
        preOrder(node.right,nodes);
    }

    public static boolean isValidBST(TreeNode root) {
        if(root.left == null && root.right == null)
            return true;
        ArrayList<Integer> nodes = new ArrayList<>();
        preOrder(root,nodes);
        for(int i=1;i<nodes.size();i++){
            if(nodes.get(i) <= nodes.get(i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        TreeNode root = TreeNode.createBST(new int[]{1,2,3,4,5,6,7});
        System.out.println("Is the Tree a BST : " + isValidBST(root));
    }
}
