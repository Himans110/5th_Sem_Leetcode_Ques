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
    public int[] findMode(TreeNode root) {
        HashMap<Integer, Integer> a = new HashMap<>();
        create(root, a);
        int max = -1;
        for(Integer i : a.keySet()){
            max = Math.max(max,a.get(i));
        }
        List<Integer> l = new ArrayList<>();
        for(Integer i : a.keySet()){
            if(a.get(i) == max) l.add(i);
        }
        int[] arr = l.stream().mapToInt(Integer::intValue).toArray();
        return arr;
        
    }
    public void create(TreeNode root , HashMap<Integer, Integer> a){
        if(root == null){
            return;
        }
        a.put(root.val,a.getOrDefault(root.val,0)+1);
        create(root.left,a);
        create(root.right,a);
    }
}