class Solution {
    public int[] decimalRepresentation(int n) {
        List<Integer> l = new ArrayList<>();
        int pw = 1 , m = 0;
        while(n > 0){
            int rem = n % 10;
            if(rem != 0){
                l.add(rem * pw);
            }
            pw *= 10;
            n = n / 10;
        }
        int ans[] = new int[l.size()];
        for(int i = l.size()-1 ; i>= 0 ; i--){
            ans[m++] = l.get(i);
        }
        return ans;
    }
}