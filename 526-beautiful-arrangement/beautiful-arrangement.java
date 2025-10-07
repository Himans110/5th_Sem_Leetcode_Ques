class Solution {
    int res = 0;
    public int countArrangement(int n) {
        if(n == 0) return 0;
        fun(n , 1 , new int[n+1]);
        return res;
    }
    public void fun(int n , int st , int[] unused){
        if(st > n){
            res++;
            return;
        }
        for(int i =1 ; i<= n ; i++){
            if(unused[i] == 0 && (i % st == 0 || st % i == 0)){
                unused[i] = 1;
                fun(n , st+1, unused);
                unused[i] = 0;
            }
        }
    }
}