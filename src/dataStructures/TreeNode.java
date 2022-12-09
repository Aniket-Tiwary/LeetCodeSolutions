package dataStructures;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
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

    public static TreeNode createBST(int[] values){
        if(values.length == 0)
            return null;
        Arrays.sort(values);
        int middle = values.length / 2;
        TreeNode root = new TreeNode(values[middle]);
        int [] leftValues = IntStream.range(0,middle).map(i->values[i]).toArray();
        int [] rightValues = IntStream.range(middle+1,values.length).map(i->values[i]).toArray();
        TreeNode left = createBST(leftValues);
        TreeNode right = createBST(rightValues);
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
    }

    public static TreeNode createTree(String[] nodes){
        if(nodes.length == 0)
            return null;
        String nodeVal = nodes[0];
        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        int index = 1;
        while(!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.remove();
            if (index == nodes.length) {
                break;
            }
            nodeVal = nodes[index++];
            if (!nodeVal.equals("null")) {
                int leftNumber = Integer.parseInt(nodeVal);
                node.left = new TreeNode(leftNumber);
                nodeQueue.add(node.left);
            }

            if (index == nodes.length) {
                break;
            }

            nodeVal = nodes[index++];
            if (!nodeVal.equals("null")) {
                int rightNumber = Integer.parseInt(nodeVal);
                node.right = new TreeNode(rightNumber);
                nodeQueue.add(node.right);
            }
        }
        return root;
    }


}
