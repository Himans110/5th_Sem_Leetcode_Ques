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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        int max = Integer.MIN_VALUE;
        int l = 0;
        int ans = 0;
        q.add(root);
        while(!q.isEmpty()){
            l++;
            int sum = 0;
            int n = q.size();
            for(int i = 0 ; i < n ; i++){
                TreeNode  v = q.poll();
                sum += v.val;
                if(v.left != null) q.add(v.left);
                if(v.right != null) q.add(v.right);
            }
            if(sum > max){
                max = sum;
                ans = l;
            }
        }
        return ans;
    }
}