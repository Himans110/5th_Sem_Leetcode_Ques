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
    public List<Integer> rightSideView(TreeNode root) {
            List<Integer> a = new ArrayList<>();
            rightside(root,1,a);
            return a;
    }
    int maxd = 0;
    public void rightside(TreeNode root,int cl,List<Integer> a){
        if(root == null){
            return;
        }
        if(maxd < cl){
            a.add(root.val);
            maxd = cl;
        }
        rightside(root.right,cl+1,a);
        rightside(root.left,cl+1,a);
    }
}