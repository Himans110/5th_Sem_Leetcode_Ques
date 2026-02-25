class Solution {
    public int[] sortByBits(int[] arr) {
        int[][] res=new int[arr.length][2];

        for(int i=0;i<arr.length;i++){
            res[i][0]=arr[i];
            res[i][1] =Integer.bitCount(arr[i]);
        }

        Arrays.sort(res,(a,b)->{
            if(a[1]==b[1]) return a[0]-b[0];
            return a[1]-b[1]; 
        });

        int[] count=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            count[i]=res[i][0];
        }
       return count;
    }
}