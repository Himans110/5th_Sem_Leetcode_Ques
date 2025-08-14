/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        build(root,sb);
        return sb.toString();
    }
    public void build(TreeNode root , StringBuilder sb){
        if(root == null){
            sb.append("null,");
            return;
        }
        sb.append(root.val).append(",");
        build(root.left,sb);
        build(root.right,sb);
    }
    public TreeNode deserialize(String data) {
        if(data == null || data.isEmpty()){
            return null;
        }
        String arr[] = data.split(",");
        return parse(arr);
    }
    int idx = 0;
    public TreeNode parse(String []arr){
        if(idx > arr.length){
            return  null;
        }
        String s = arr[idx++];
        if(s.equals("null")){
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(s));
        node.left = parse(arr);
        node.right = parse(arr);
        return node;
    }
}