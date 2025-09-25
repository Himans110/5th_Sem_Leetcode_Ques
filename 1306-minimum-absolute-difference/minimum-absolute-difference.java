class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int mini = Integer.MAX_VALUE;
        for(int  i = 1 ; i < arr.length ; i++){
            mini = Math.min(mini , Math.abs(arr[i]-arr[i-1]));
        }
        List<List<Integer>> l = new ArrayList<>();
        for(int i = 0 ; i < arr.length-1 ; i++){
            if(Math.abs(arr[i] - arr[i+1]) == mini){
                List<Integer> a = new ArrayList<>();
                a.add(arr[i]);
                a.add(arr[i+1]);
                l.add(a);
            }
        }
        return l;
    }
}