class Solution {
    public int totalWaviness(int num1, int num2) {
        int w=0;
        while(num1<=num2)
            {
                if(num1<100)num1++;
                else
                {
                    String s=String.valueOf(num1);
                    for(int i=1;i<s.length()-1;i++)
                        {
                            if(s.charAt(i-1)-'0'>s.charAt(i)-'0' && s.charAt(i)-'0'<s.charAt(i+1)-'0')w++;
                            if(s.charAt(i-1)-'0'<s.charAt(i)-'0' && s.charAt(i)-'0'>s.charAt(i+1)-'0')w++;
                        }
                    num1++;
                }
            }
        return w;
    }
}