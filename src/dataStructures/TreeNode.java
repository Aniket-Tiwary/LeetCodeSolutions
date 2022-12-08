package dataStructures;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }

    public static TreeNode createTree(int[] values){
        if(values.length == 0)
            return null;
        Arrays.sort(values);
        int middle = values.length / 2;
        TreeNode root = new TreeNode(values[middle]);
        int [] leftValues = IntStream.range(0,middle).map(i->values[i]).toArray();
        int [] rightValues = IntStream.range(middle+1,values.length).map(i->values[i]).toArray();
        TreeNode left = createTree(leftValues);
        TreeNode right = createTree(rightValues);
        root.left = left;
        root.right = right;
        return root;
    }

    public static void printTree(TreeNode root) {
        if (root == null)
            return;
        if (root.left != null) {
            printTree(root.left);
        }
        System.out.print(root.val + " ");
        if(root.right != null){
            printTree(root.right);
        }
//        System.out.println("");
    }
}
