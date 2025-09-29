class Solution {
    public int[] maxSlidingWindow(int[] a, int k) {
        int n = a.length;
        int p[] = new int[n];
        int s[] = new int[n];
        int ans[] = new int[n-k+1];
        p[0] = a[0];
        for(int i = 1 ; i < n ; i++){
            if(i % k == 0) p[i] = a[i];
            else p[i] = Math.max(p[i-1],a[i]);
        }
        s[n-1] = a[n-1];
        for(int i = n-2 ; i >= 0 ; i--){
            if((i+1) % k == 0) s[i] = a[i];
            else s[i] = Math.max(s[i+1],a[i]);
        }
        for(int i = 0 ; i < ans.length ; i++){
            ans[i] = Math.max(s[i],p[i+k-1]);
        }
        return ans;
    }
}