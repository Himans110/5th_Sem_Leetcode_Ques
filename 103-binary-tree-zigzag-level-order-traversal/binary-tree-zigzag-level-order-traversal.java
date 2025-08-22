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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> a1 = new ArrayList<>();
        if (root == null) return a1;
        levelorder(root, a1);
        for(int i = 0 ; i< a1.size(); i++){
            if(i % 2 != 0) reverse(a1.get(i));
        }
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
    public void reverse(List<Integer> a){
        int i = 0 ;
        int j = a.size()-1;
        while(i < j){
            int temp = a.get(i); 
            a.set(i, a.get(j));      
            a.set(j, temp); 
            i++;
            j--;
        }
    }
}