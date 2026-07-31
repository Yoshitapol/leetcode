import java.util.Arrays;
class Solution {
    public int minimumPushes(String word) {

        int[] freq = new int[26];
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            freq[ch - 'a']++;
        }
        Arrays.sort(freq);
        int ans = 0;
        int count = 0;
        for (int i = 25; i >= 0; i--) {
            if (freq[i] == 0)
                break;
            if (count < 8)
                ans += freq[i];
            else if (count < 16)
                ans += freq[i] * 2;
            else if (count < 24)
                ans += freq[i] * 3;
            else
                ans += freq[i] * 4;
            count++;
        }
        return ans;
    }
}