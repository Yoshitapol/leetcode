class Solution {
    public int longestPalindrome(String s) {
        if(s.length() == 0)
            return 0;
        else if(s.length() == 1)
            return 1;
        int i;
        char[] ch = s.toCharArray();
        int[] freq = new int[128];
        int count = 0;
        boolean odd = false;
        for(i=0;i<s.length();i++)
            freq[ch[i]]++;
        for(i=0;i<128;i++){
            count = count+((freq[i]/2)*2);
            if(freq[i] %2 != 0)
                odd = true;
        }
        if(odd)
            return count+1;
        else 
            return count;
    }
}