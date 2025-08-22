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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> a1 = new ArrayList<>();
        if (root == null) return a1;
        levelorder(root, a1);
        return a1;
    }
    public void levelorder(TreeNode root, List<List<Integer>> a1 ){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> a = new ArrayList<>();
            int n = q.size();
            for(int i = 0 ; i < n  ; i++){
                TreeNode top = q.poll();
                a.add(top.val);
                if(top.left != null){
                    q.add(top.left);
                }
                if(top.right != null){
                    q.add(top.right);
                }
            }
            a1.add(a);
        }
    }
}