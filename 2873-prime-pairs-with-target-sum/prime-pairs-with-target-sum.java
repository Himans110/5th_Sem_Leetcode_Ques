class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean prime[] = new boolean[n+1];
        prime[0]  = false;
        prime[1] = false;
        List<Integer> l = new ArrayList<>();
        for(int i = 2 ; i*i <= n ; i++){
            if(!prime[i]) {
                for(int j = i*i; j <= n; j += i) {
                    prime[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (!prime[i]) l.add(i);
        }
        int i = 0, j = l.size() - 1;
        while (i <= j) {
            int sum = l.get(i) + l.get(j);
            if (sum == n) {
                ans.add(Arrays.asList(l.get(i), l.get(j)));
                i++;
                j--;
            } else if (sum < n) {
                i++;
            } else {
                j--;
            }
        }
        return ans;
    }
}