import java.util.*;
class Solution {
    public int maximumBags(int[] ca, int[] rock, int item) {
        int n = ca.length;
        int[] diff = new int[n];
        for(int i = 0; i < n; i++){
            diff[i] = ca[i] - rock[i];
        }
        Arrays.sort(diff);
        int count = 0;
        for(int i = 0; i < n; i++){
            if(diff[i] == 0){ 
                count++;
            } else if(item >= diff[i]){ 
                item -= diff[i];
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
