class Solution {
    public int candy(int[] arr) {
        int n = arr.length;
        int p[] = new int[n];
        p[0] = 1;
        for(int i = 1; i< n ; i++){
            if(arr[i] > arr[i-1]){
                p[i] = p[i-1]+1;
            }
            else{
                p[i] = 1;
            }
        }
        int s[] = new int[n];
        s[n-1] = 1;
        for(int i = n-2; i >=0 ; i--){
            if(arr[i] > arr[i+1]){
                s[i] = s[i+1]+1;
            }
            else{
                s[i] = 1;
            }
        }
        int ans = 0;
        for(int i =0 ; i< n ; i++){
            ans += Math.max(p[i],s[i]);
        }
        return ans;
    }
}