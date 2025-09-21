class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for(int i : arr2){
            b.add(i);
        }
        for(int i : arr1){
            if(!b.contains(i)){
                a.add(i);
            }
        }
        Collections.sort(a);
        int m = 0;
        int ans[] = new int[arr1.length];
        for(int i : arr2){
            int j = map.get(i);
            for(int k = 0 ; k < j ; k++){
                ans[m++] = i;
            }
        }
        for(int i : a){
            ans[m++] = i;
        }
        return ans;
    }
}