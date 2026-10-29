class Solution(object):
    def findDisappearedNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        seen=set(nums)
        ans=[]
        n=len(nums)
        for i in range(1,n+1):
            if i not in seen:
                ans.append(i)
        return ans