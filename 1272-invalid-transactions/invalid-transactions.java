class Solution {
    public List<String> invalidTransactions(String[] arr) {
        String[] s = new String[arr.length];
        int[] t = new int[arr.length];
        int[] am = new int[arr.length];
        String[] city = new String[arr.length];
        for(int i = 0; i < arr.length; i++){
            String[] m = arr[i].split(",");
            s[i] = m[0];
            t[i] = Integer.parseInt(m[1]);
            am[i] = Integer.parseInt(m[2]);
            city[i] = m[3];
        }

        List<String> ans = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            boolean invalid = false;
            if(am[i] > 1000){
                invalid = true;
            }
            for(int j = 0; j < arr.length; j++){
                if(i == j) continue;
                if(s[i].equals(s[j]) &&
                   Math.abs(t[i] - t[j]) <= 60 &&
                   !city[i].equals(city[j])){
                    invalid = true;
                }
            }
            if(invalid){
                ans.add(arr[i]);
            }
        }
        return ans;
    }
}
