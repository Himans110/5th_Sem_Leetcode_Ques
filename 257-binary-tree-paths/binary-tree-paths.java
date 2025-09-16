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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> l = new ArrayList<>();
        fun(root,"",l);
        return l;
    }
    public void fun(TreeNode root , String ans , List<String> l){
        if(root.left == null && root.right == null){
            l.add(ans+root.val);
            return;
        }
        if(root.left != null) fun(root.left , ans + root.val+"->" , l);
        if(root.right != null ) fun(root.right , ans + root.val+"->" , l);
    }
}