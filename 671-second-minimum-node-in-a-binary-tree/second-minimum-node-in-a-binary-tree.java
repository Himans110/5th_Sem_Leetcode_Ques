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
    public int findSecondMinimumValue(TreeNode root) {
        HashSet<Integer> a = new HashSet<>();
        prepare(root,a);
        if(a.size() == 0 || a.size()==1) return -1;
        List<Integer> list = new ArrayList<>(a);
        Collections.sort(list);
        return list.get(1);
    }
    public void prepare(TreeNode root, HashSet<Integer> a){
        if(root == null) return;
        a.add(root.val);
        prepare(root.left, a);
        prepare(root.right, a);
    }
}