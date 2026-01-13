class Solution {
    class Meeting {
        long start;
        long end;
        int room;
        Meeting(long start, long end, int room) {
            this.start = start;
            this.end = end;
            this.room = room;
        }
    }
    public int mostBooked(int n, int[][] arr) {
        int[] room = new int[n];
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        PriorityQueue<Integer> rooms = new PriorityQueue<>();
        for (int i = 0; i < n; i++) rooms.add(i);
        PriorityQueue<Meeting> occupy = new PriorityQueue<>(
            (a, b) -> {
                if (a.end == b.end) return a.room - b.room;
                return Long.compare(a.end, b.end);
            }
        );
        for (int[] m : arr) {
            long st = m[0], en = m[1];
            // free rooms whose meetings ended before current start
            while (!occupy.isEmpty() && occupy.peek().end <= st) {
                rooms.add(occupy.poll().room);
            }
            // available rooms
            if (!rooms.isEmpty()) {
                int r = rooms.poll();
                occupy.add(new Meeting(st, en, r));
                room[r]++;
            } 
            // delay meeting if room not avialable
            else {
                Meeting meet = occupy.poll();
                long diff = en - st;
                long newst = meet.end;
                long newend = newst + diff;
                occupy.add(new Meeting(newst, newend, meet.room));
                room[meet.room]++;
            }
        }
        int ans = 0;
        for (int i = 1; i < n; i++) {
            if (room[i] > room[ans]) ans = i;
        }
        return ans;
    }
}
