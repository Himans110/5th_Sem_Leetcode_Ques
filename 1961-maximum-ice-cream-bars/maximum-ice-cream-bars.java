class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int sum = 0, c = 0;
        for(int i : costs){
            sum += i;
            if(sum <= coins) c++;
            else if(sum> coins) break;
        }
        return c;
    }
}