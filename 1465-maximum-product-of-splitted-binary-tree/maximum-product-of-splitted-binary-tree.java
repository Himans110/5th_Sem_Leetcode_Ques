class Solution {
    long total = 0;
    long maxi = 0;
    public int maxProduct(TreeNode root) {
        total(root); 
        subtree(root);
        return (int)(maxi % 1000000007);
    }
    public long total(TreeNode root){
        if(root == null) return 0;
        long a1 = total(root.left);
        long b1 = total(root.right);
        long sum = root.val + a1 + b1;
        total = sum;
        return sum;
    }
    public long subtree(TreeNode root){
        if(root == null) return 0;
        long a = subtree(root.left);
        long b = subtree(root.right);
        long sub = root.val + a + b;
        maxi = Math.max(maxi, sub * (total - sub));
        return sub;
    }
}
