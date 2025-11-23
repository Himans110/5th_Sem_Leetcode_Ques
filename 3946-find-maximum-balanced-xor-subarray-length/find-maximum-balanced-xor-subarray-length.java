class Solution {
    public int maxBalancedSubarray(int[] nums) {
        Map<String, Integer> hash = new HashMap<>();
        int n = nums.length;
        hash.put("0#0", -1);
        int odd = 0, even = 0, xr = 0, res = 0;
        for (int i = 0; i < n; i++) {

            xr ^= nums[i];

            if (nums[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            int diff = odd - even;
            String key = xr + "#" + diff;

            if (hash.containsKey(key)) {
                res = Math.max(res, i - hash.get(key));
            } else {
                hash.put(key, i);
            }
        }

        return res;
    }
}