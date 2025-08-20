/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> l = new ArrayList<>();
        buildi( l, root);
        return l;
    }
    public void buildi(List<Integer> l , Node root){
        if(root == null){
            return;
        }
        for(Node nn : root.children){
            buildi(l,nn);
        }
        l.add(root.val);
    }
}