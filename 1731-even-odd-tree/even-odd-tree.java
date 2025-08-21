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
    public boolean isEvenOddTree(TreeNode root) {
        List<List<Integer>> a1 = new ArrayList<>();
        inorder(root, a1);
        for (int i = 0; i < a1.size(); i++) {
            List<Integer> a = a1.get(i);
            for (int j = 0; j < a.size(); j++) {
                int val = a.get(j);
                if (i % 2 == 0) {
                    if (val % 2 == 0) return false;
                    if (j > 0 && a.get(j) <= a.get(j - 1)) return false;
                } else {
                    if (val % 2 != 0) return false;
                    if (j > 0 && a.get(j) >= a.get(j - 1)) return false;
                }
            }
        }
        return true;
    }
    public void inorder(TreeNode root , List<List<Integer>> a1 ){
        if(root == null){
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> a = new ArrayList<>();
            for(int i = 0 ; i < n ; i++){
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