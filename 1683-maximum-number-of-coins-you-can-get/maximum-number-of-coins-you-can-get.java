class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int n = piles.length/3;
        int sum = 0;
        if(piles.length %2 == 0){
            for(int i = piles.length-1 ; i >= 0 ; i--){
                if(i % 2 == 0  && n-- >= 0){
                    sum += piles[i];
                }
                if(n <= 0) break; 
            }
        }
        else{
            for(int i = piles.length-1 ; i >= 0 ; i--){
                if(i % 2 != 0  && n-- >= 0){
                    sum += piles[i];
                }
                if(n <= 0) break; 
            }
        }
        return sum;
    }
}