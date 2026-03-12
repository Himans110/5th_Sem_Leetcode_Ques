class Solution {
    int i = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return helper(preorder, Integer.MAX_VALUE);
    }
    public TreeNode helper(int preorder[], int upperbound){
        if(i == preorder.length || preorder[i] > upperbound) return null;
        TreeNode root = new TreeNode(preorder[i++]);
        root.left = helper(preorder, root.val);
        root.right = helper(preorder, upperbound);
        return root;
    }
}