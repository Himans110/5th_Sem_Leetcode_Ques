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
    long total;
    long max = Long.MIN_VALUE;
    public int maxProduct(TreeNode root) {
        total = sum(root);
        long ans = dfs(root);
        return (int) (max%1000000007);
    }
    public long dfs(TreeNode root){
        if(root == null) {
            return 0;
        }
        long left = dfs(root.left);
        long right = dfs(root.right);
        long curr = left+right+root.val;
        long ans = curr*(total-curr);
        max = Math.max(max, ans);
        return curr;
    }
    public long sum(TreeNode root){
        if(root == null){
            return 0;
        }
        long left = sum(root.left);
        long right = sum(root.right);
        return left+right+root.val;
    }
}