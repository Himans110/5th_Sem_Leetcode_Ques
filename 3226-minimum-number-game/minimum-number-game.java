class Solution {
    public int[] numberGame(int[] nums) {
        int arr[] = new int[nums.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : nums){
            pq.add(num);
        }
        int k = 0;
        while(!pq.isEmpty()){
            int alice = pq.poll();
            int bob = pq.poll();
            arr[k++] = bob;
            arr[k++] = alice;
        }
        return arr;
    }
}