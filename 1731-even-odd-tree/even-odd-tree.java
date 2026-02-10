class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        if(root.val % 2 == 0) return false;
        int level = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> l = new ArrayList<>();
            int size = q.size();
            while(size-- > 0){
                TreeNode curr = q.poll();
                l.add(curr.val);
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            boolean ans = check(l, level);
            if(!ans) return false;
            level++;
        }
        return true;
    }
    public boolean check(List<Integer> l , int level){
        if(level % 2 == 0){
            for(int i = 0 ; i < l.size()-1 ; i++){
                if(l.get(i) % 2 != 0){
                    if(l.get(i) >= l.get(i+1)) return false;
                }else{
                    return false;
                }
            }
            if(l.get(l.size()-1) % 2 == 0) return false;
        }else{
            for(int i = 0 ; i < l.size()-1 ; i++){
                if(l.get(i) % 2 == 0){
                    if(l.get(i) <= l.get(i+1)) return false;
                }else{
                    return false;
                }
            }
            if(l.get(l.size()-1) % 2 != 0) return false;
        }
        return true;
    }
}
