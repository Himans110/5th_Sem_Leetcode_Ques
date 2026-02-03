import java.util.*;
class MyCalendar {
    private List<int[]> arr;
    public MyCalendar() {
        arr = new ArrayList<>();
    }
    public boolean book(int start, int end) {
        for (int[] a : arr) {
            if ((start < a[0] && end > a[0]) || (start == a[0]) || (start > a[0] && start < a[1])) {
                return false;
            }
        }
        arr.add(new int[]{start, end});
        return true;
    }
}