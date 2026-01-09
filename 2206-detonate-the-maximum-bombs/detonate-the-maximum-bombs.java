class Solution {
    public int maximumDetonation(int[][] bombs) {
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i =0;i<bombs.length;i++){
            map.put(i, new ArrayList<>());
        }
        for(int i =0;i<bombs.length;i++){
            for(int j =0;j<bombs.length;j++){
                if(i==j) continue;
                long dis = (long)(bombs[i][0]-bombs[j][0])*(bombs[i][0]-bombs[j][0]) +
                (long) (bombs[i][1]-bombs[j][1])*(bombs[i][1]-bombs[j][1]);
                long r =(long) bombs[i][2]*bombs[i][2];
                if(r>=dis) map.get(i).add(j);
            }
        }
        int ans = 0;
        for(int i =0;i<bombs.length;i++){
            HashSet<Integer> visited = new HashSet<>();
            Queue<Integer> q = new LinkedList<>();
            q.add(i);
            int count = 0;
            while(!q.isEmpty()){
                int r = q.poll(); 
                if(visited.contains(r)) continue;
                visited.add(r);
                count++;
                for(int n:map.get(r)){
                    if(!visited.contains(n))
                    q.add(n);
                }
            }
            ans = Math.max(ans,count);
        }
        return ans;
    }
}