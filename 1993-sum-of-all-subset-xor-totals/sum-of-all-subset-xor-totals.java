class Solution {
    public int subsetXORSum(int[] arr){
        return helper(arr, 0, 0);        
    }
    public int helper(int[] a, int i, int x){
        if(i == a.length) return x;
        int t = helper(a, i+1, x ^ a[i]);
        int nt = helper(a, i+1, x);
        return t+nt;
    }
}