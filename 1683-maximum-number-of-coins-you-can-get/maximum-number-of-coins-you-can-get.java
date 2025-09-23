class Solution {
    public int maxCoins(int[] piles) {
        List<Integer> l = new ArrayList<>();
        for(int i : piles){
            l.add(i);
        }
        Collections.sort(l);
        int n = piles.length/3;
        int sum = 0;
        if(l.size() %2 == 0){
            for(int i = l.size()-1 ; i >= 0 ; i--){
                if(i % 2 == 0  && n-- >= 0){
                    sum += l.get(i);
                }
                if(n <= 0) break; 
            }
        }
        else{
            for(int i = l.size()-1 ; i >= 0 ; i--){
                if(i % 2 != 0  && n-- >= 0){
                    sum += l.get(i);
                }
                if(n <= 0) break; 
            }
        }
        return sum;
    }
}