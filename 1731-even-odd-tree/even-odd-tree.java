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
    List<List<Integer>> a1 = new ArrayList<>();
    public boolean isEvenOddTree(TreeNode root) {
        helper(root,0);
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
    public void helper(TreeNode node,int level){
        if(node==null) return;
        if(a1.size()==level) a1.add(new ArrayList<>());
        a1.get(level).add(node.val);
        helper(node.left,level+1);
        helper(node.right,level+1);
    }
}