class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int arr[] = new int[nums.length-k+1];
        int m = 0;
        for(int i = 0 ; i <= nums.length - k ; i++){
            arr[m++] = find(nums, i , i+k-1, x);
        }
        return arr;
    }
    public int find(int arr[] , int st , int end , int x){
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i = st ; i <= end ; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        List<Map.Entry<Integer, Integer>> l = new ArrayList<>(map.entrySet());
        Collections.sort(l, (a, b) -> {
            if (a.getValue().equals(b.getValue()))
                return b.getKey() - a.getKey();
            else
                return b.getValue() - a.getValue();
        });
        int sum = 0;
        for (Map.Entry<Integer, Integer> e : l) {
            if (x == 0) break;
            sum += e.getKey() * e.getValue();
            x--;
        }
        return sum;
    }
}