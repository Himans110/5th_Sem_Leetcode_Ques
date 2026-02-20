class Solution {
    List<Integer> arr = new ArrayList<>();
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        List<List<Integer>> ans = new ArrayList<>();
        inorder(root);
        for (int q : queries) {
            int low = floor(q);
            int high = ceil(q);
            List<Integer> temp = new ArrayList<>();
            temp.add(low);
            temp.add(high);
            ans.add(temp);
        }

        return ans;
    }
    private void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        arr.add(root.val);
        inorder(root.right);
    }
    private int floor(int target) {
        int st = 0, end = arr.size() - 1;
        int ans = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr.get(mid) <= target) {
                ans = arr.get(mid);
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
    private int ceil(int target) {
        int st = 0, end = arr.size() - 1;
        int ans = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr.get(mid) >= target) {
                ans = arr.get(mid);
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return ans;
    }
}