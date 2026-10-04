class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        s=s.lower()
        s=re.sub(r'[^A-Za-z0-9]','',s)
        n=len(s)-1
        i=0
        while i<n:
            if s[i] != s[n]:
                return False
            i=i+1
            n=n-1
        return True