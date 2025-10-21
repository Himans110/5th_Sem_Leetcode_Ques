class Solution {
    public int finalValueAfterOperations(String[] o) {
        int c = 0;
        for(int i = 0 ; i < o.length ; i++){
            if (o[i].equals("++X") || o[i].equals("X++")) {
            c += 1;
        } else if (o[i].equals("--X") || o[i].equals("X--")) {
            c -= 1;
        }
        }
        return c;
    }
}