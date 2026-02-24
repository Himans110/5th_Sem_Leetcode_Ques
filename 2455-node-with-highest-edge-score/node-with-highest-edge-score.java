class Solution {
    public int edgeScore(int[] arr) {
        long[] score = new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            score[arr[i]] += i;
        }
        long max = -1;
        int result = 0;
        for (int i = 0; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
                result = i;
            }
        }
        return result;
    }
}