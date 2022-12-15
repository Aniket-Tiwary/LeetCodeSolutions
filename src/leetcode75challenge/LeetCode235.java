package leetcode75challenge;

import dataStructures.TreeNode;

public class LeetCode235 {

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int pVal = p.val;
        int qVal = q.val;
        while(root != null){
            if(pVal > root.val && qVal > root.val)
                root = root.right;
            else if(pVal < root.val && qVal < root.val)
                root = root.left;
            else
                return root;
        }
        return root;
    }

    public static void main(String args[]){
        TreeNode root = TreeNode.createBST(new int[]{1,2,3,4,5,6,7,8});
        System.out.println("LCA of node 5 and node 8 is : " + lowestCommonAncestor(root,root.left,root.right).val);
    }
}
