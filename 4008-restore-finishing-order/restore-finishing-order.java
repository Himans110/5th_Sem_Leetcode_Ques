class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> h = new HashSet<>();
        for(int i : friends){
            h.add(i);
        }
        int ans[] = new int[friends.length];
        int m = 0;
        for(int i = 0 ; i < order.length ; i++){
            if(h.contains(order[i])){
                ans[m++] = order[i]; 
            }
        }
        return ans;
    }
}