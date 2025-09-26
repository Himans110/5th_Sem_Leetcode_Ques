class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        long low = 1;
        int max = Integer.MIN_VALUE;
        for(int i : piles){
            max = Math.max(max,i);
        }
        long high = max;
        long ans = -1;
        while(low <= high){
            long mid = low + (high - low) / 2;
            if(ispossible(piles,mid,h)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return (int)ans;
    }
    public boolean ispossible(int piles[] , long mid, int h){
        long sum = 0;
        for(int i = 0 ; i < piles.length ; i++){
            sum += piles[i]/mid;
            if(piles[i] % mid != 0){
                sum += 1;
            }
        }
        return sum <= h;
    }
}