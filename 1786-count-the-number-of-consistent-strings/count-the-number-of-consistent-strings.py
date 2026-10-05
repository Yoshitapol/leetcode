class Solution(object):
    def countConsistentStrings(self, allowed, words):
        """
        :type allowed: str
        :type words: List[str]
        :rtype: int
        """
        count=0
        for word in words:
            flag=True
            for ch in word:
                if ch not in allowed:
                    flag=False
            if flag==True:
                count=count+1
        return count