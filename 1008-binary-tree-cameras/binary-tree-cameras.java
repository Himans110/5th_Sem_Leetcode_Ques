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
    int camera = 0;
    public int minCameraCover(TreeNode root) {
        int c = mincamera(root);
            if(c == -1) camera++;
            return camera;
        }
        public int mincamera(TreeNode root){
            if(root == null){
                return 0;
            }
            int left = mincamera(root.left);
            int right = mincamera(root.right);
            if(left == -1 || right == -1){ // camera ki need hai.
                camera++;
                return 1; // camera set up kar diya node par.
            }
            else if(left == 1 || right == 1){ // in mai se kisi ek pas camera or dono ke pas or ek ke pas camera hai dusra covred hai
                return 0; // iska mtlb mai covered hu;
            }
            else{
                return -1; // camera ki need hai;
            }
    }
}