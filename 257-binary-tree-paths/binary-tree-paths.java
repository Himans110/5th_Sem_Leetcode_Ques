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
        List<String> a = new ArrayList<>();
         if (root != null) {
            build(root, "", a);
        }
        return a;
    }
    public void build(TreeNode root, String ans , List<String> a){
        if(root.left == null && root.right == null){
            a.add(ans+root.val);
            return;
        }
        if(root.left != null) build(root.left, ans+root.val+"->",a);
        if(root.right != null) build(root.right,ans+root.val+"->",a);
    }
}