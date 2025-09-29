class Solution {
    public void rotate(int[][] m) {
        for(int i = 0 ;i < m.length ; i++){
            for(int j = i+1 ;  j < m[0].length ; j++){
                int temp = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = temp;
            }
        }
        for(int i[] : m){
            reverse(i);
        }
    }
    public void reverse(int arr[]){
        int i = 0 , j = arr.length-1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}