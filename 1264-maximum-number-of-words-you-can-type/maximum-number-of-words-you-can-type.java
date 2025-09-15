class Solution {
    public int canBeTypedWords(String text, String bl) {
        int count = 0;
        String arr[] = text.split(" ");
        for(String i : arr){
            boolean flag = false;
            for(int j = 0 ; j < bl.length() ; j++){
                if(i.contains(bl.charAt(j)+"")){
                    flag = true;
                    break;
                }
            }
            if(!flag) count++;
        }
        return count;
    }
}