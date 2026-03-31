class EventManager {

    Map<Integer, Integer> map;
    PriorityQueue<int[]> pq;

    public EventManager(int[][] events) {
        pq = new PriorityQueue<>((a,b) -> {
            if(a[1] == b[1]) return a[0] - b[0];
            return b[1] - a[1];
        });
        map = new HashMap<>();
        for(int []e : events){
            int id = e[0];
            int p = e[1];
            map.put(id , p);
            pq.offer(new int[]{id , p});
        }
    }
    
    public void updatePriority(int eventId, int newPriority) {
        map.put(eventId, newPriority);
        pq.offer(new int[]{eventId, newPriority});
    }
    
    public int pollHighest() {
        while(!pq.isEmpty()){
            int temp[] = pq.poll();
            int id = temp[0];
            int p = temp[1];
            if(map.containsKey(id) && map.get(id) == p){
                map.remove(id);
                return id;
            }
        }
        return -1;
    }
}

/**
 * Your EventManager object will be instantiated and called as such:
 * EventManager obj = new EventManager(events);
 * obj.updatePriority(eventId,newPriority);
 * int param_2 = obj.pollHighest();
 */