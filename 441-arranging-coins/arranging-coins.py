class Solution(object):
    def arrangeCoins(self, n):
        """
        :type n: int
        :rtype: int
        """
        count=0
        i=1
        while i<=n:
            n-=i
            count+=1
            i+=1
        return count