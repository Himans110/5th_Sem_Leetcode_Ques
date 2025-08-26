/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int sum = 0;
    public int sumEvenGrandparent(TreeNode root) {
        fun(root,null,null);
        return sum;
    }
    public void fun(TreeNode node, TreeNode parent , TreeNode grandparent){
        if (node == null) return;

        if (grandparent != null && grandparent.val % 2 == 0) {
            sum += node.val; 
        }
        fun(node.left, node, parent);
        fun(node.right, node, parent);
    }
}