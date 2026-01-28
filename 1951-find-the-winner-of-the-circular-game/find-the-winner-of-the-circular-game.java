class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1 ; i <= n; i++){
            q.add(i);
        }
        int c = 1;
        while(q.size() > 1){
            int a = q.poll();
            if(c == k){
                c = 1;
            }
            else {q.add(a);
            c++;}
        }
        return q.poll();
    }
}