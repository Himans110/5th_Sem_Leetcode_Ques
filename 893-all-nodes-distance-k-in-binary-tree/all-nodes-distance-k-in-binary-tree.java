/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        HashMap<TreeNode,TreeNode> map = new HashMap<>();
        List<Integer> l = new ArrayList<>();
        inorder(root,map);
        BSF(root,target,k,l,map);
        return l;
    }
    public void inorder(TreeNode root, HashMap<TreeNode,TreeNode> map){
        if(root == null) return;
        if(root.left != null){
            map.put(root.left,root);
        }
        inorder(root.left,map);
        if(root.right != null){
            map.put(root.right,root);
        }
        inorder(root.right,map);
    }
    public void BSF(TreeNode root, TreeNode target,int k , List<Integer> a,HashMap<TreeNode,TreeNode> map){
        Queue<TreeNode> q = new LinkedList<>();
        HashSet<TreeNode> visited = new HashSet<>();
        q.add(target);
        visited.add(target);
        int l = 0;
        while(!q.isEmpty()){
            int n = q.size();
            if(l == k){
                for(TreeNode node : q){
                    a.add(node.val);
                }
                return;
            }
            for(int i = 0 ; i < n ; i++){
                TreeNode curr = q.poll();
                // left child
                if (curr.left != null && !visited.contains(curr.left)) {
                    visited.add(curr.left);
                    q.add(curr.left);
                }
                // right child
                if (curr.right != null && !visited.contains(curr.right)) {
                    visited.add(curr.right);
                    q.add(curr.right);
                }
                // parent
                if (map.containsKey(curr) && !visited.contains(map.get(curr))) {
                    visited.add(map.get(curr));
                    q.add(map.get(curr));
                }
            }
            l++;
        }
    }
    
}