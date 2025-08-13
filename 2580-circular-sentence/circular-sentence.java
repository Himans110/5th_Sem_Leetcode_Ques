class Solution {
    public boolean isCircularSentence(String s) {
        if(s.length() == 1){
            if(s.charAt(s.length()-1) == s.charAt(0)) return true;
            else return false;
        }
        String arr[] = s.split(" ");
        for(int i = 0 ; i< arr.length-1 ; i++){
            if(arr[i].charAt(arr[i].length()-1) != arr[i+1].charAt(0)) return false;
        }
        String last = arr[arr.length-1];
        if(last.charAt(last.length()-1) != arr[0].charAt(0)) return false;
        return true;
    }
}