class Solution {
    public int timeRequiredToBuy(int[] arr, int k) {
        Queue<int[]> q = new LinkedList<>();
        int ans = 0;
        for(int i = 0 ; i < arr.length; i++){
            if(i == k && arr[i]-1 == 0){
                return ans+1;
            }
           if(arr[i]-1 != 0) q.add(new int[]{arr[i]-1, i});
            ans++;
        }
        while(!q.isEmpty()){
            int [] r = q.poll();
            int put = r[0]-1;
            ans++;
            if(put == 0 && r[1] == k) break;
            if(put != 0) q.add(new int[]{put , r[1]});
        }
        return ans;
    }
}