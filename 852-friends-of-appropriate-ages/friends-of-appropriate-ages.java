class Solution {
    public int numFriendRequests(int[] ages) {
        int[] freq = new int[121];
        for(int age : ages){
            freq[age]++;
        }
        int count = 0;
        for(int x = 1; x <= 120; x++){
            for(int y = 1; y <= 120; y++){
                if(freq[x] == 0 || freq[y] == 0) continue;
                if(y > 0.5 * x + 7 && y <= x && !(y > 100 && x < 100)){
                    if(x == y){
                        count += freq[x] * (freq[x] - 1);
                    } else {
                        count += freq[x] * freq[y];
                    }
                }
            }
        }

        return count;
    }
}