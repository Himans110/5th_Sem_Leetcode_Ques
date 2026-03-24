class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        solve(graph , 0 , graph.length-1, ans , l);
        return ans;
    }
    public void solve(int arr[][] , int src , int des , List<List<Integer>> ans , List<Integer> l){
        if(src == des){
            l.add(des);
            ans.add(new ArrayList<>(l));
            l.removeLast();
        }
        for(int i = 0 ; i < arr[src].length; i++){
            l.add(src);
            solve(arr, arr[src][i], des, ans, l);
            l.removeLast();
        }
    }
}