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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> a = new ArrayList<>();
        makelist(root1,a);
        makelist(root2,a);
        Collections.sort(a);
        return a;
    }
    public void makelist(TreeNode root, List<Integer> a){
        if(root == null){
            return;
        }
        a.add(root.val);
        makelist(root.left,a);
        makelist(root.right,a);
    }
}