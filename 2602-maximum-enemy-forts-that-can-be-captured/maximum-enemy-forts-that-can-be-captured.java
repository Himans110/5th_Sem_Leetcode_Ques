class Solution {
    public int captureForts(int[] arr) {
        return Math.max(capleft(arr), capright(arr));
    }
    public int capleft(int[] f) {
        int ans = 0;
        int n = f.length;
        for(int i = 0; i < n; i++) {
            if(f[i] == 1) {
                for(int j = i+1; j < n; j++) {
                    if(f[j] == 1) break;
                    if(f[j] == -1){
                        ans = Math.max(j-i-1, ans);
                        break;
                    }
                }
            }
        }
        return ans;
    }
    public int capright(int[] f) {
        int ans = 0;
        int n = f.length;
        for(int i = n-1; i >= 0; i--) {
            if(f[i] == 1) {
                for(int j = i-1; j >= 0; j--) {
                    if(f[j] == 1) break;
                    if(f[j] == -1) {
                        ans = Math.max(i-j-1, ans);
                        break;
                    }
                }
            }
        }
        
        return ans;
    }
}