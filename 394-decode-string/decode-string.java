class Solution {
    public String decodeString(String s) {
        Stack<Integer> st = new Stack<>();
        Stack<StringBuilder> stsb = new Stack<>();
        StringBuilder str = new StringBuilder();
        int n = 0;
        for(char i : s.toCharArray()){
            if(Character.isDigit(i)){
                n = n* 10+(i-'0');
            }
            else if(i == '['){
                st.push(n);
                n = 0;
                stsb.push(str);
                str = new StringBuilder();
            }
            else if(i == ']'){
                int k = st.pop();
                StringBuilder temp = str;
                str = stsb.pop();
                while(k-- > 0){
                    str.append(temp);
                }
            }
            else{
                str.append(i);
            }
        }
        return str.toString();
    }
}