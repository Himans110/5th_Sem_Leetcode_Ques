class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        findCombinations(n, k, 1, new ArrayList<>(), result);
        return result;
    }

    private void findCombinations(int n, int k, int start, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == k) {
            if (n == 0) {
                result.add(new ArrayList<>(current));
            }
            return;
        }
        for (int i = start; i <= 9; i++) {
            if (i > n) break;
            current.add(i);
            findCombinations(n - i, k, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }
}