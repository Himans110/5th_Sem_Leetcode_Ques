class Solution {
    public int minimumBuckets(String h) {
        int count = 0;
        char arr[] = h.toCharArray();
        for(int i = 0 ; i < arr.length; i++){
            char ch = arr[i];
            if(ch=='H'){
                if((i-1) >= 0 && arr[i-1] =='b'){
                    continue;
                }
                else if((i+1) < arr.length && arr[i+1]=='.'){
                   arr[i+1] = 'b';
                    count++;
                }
                else if((i-1) >= 0 && arr[i-1] == '.'){
                    arr[i-1] = 'b';
                    count++;
                }
                else return -1;
            }
        }
        return count;
    }
}