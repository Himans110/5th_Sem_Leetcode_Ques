class Solution {
    public int[] sortArray(int[] nums) {
        int[] arr = new int[nums.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : nums){
            pq.add(i);
        }
        int m = 0;
        while(!pq.isEmpty()){
            arr[m++] = pq.poll();
        }
        return arr;
    }
}