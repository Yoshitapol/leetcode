class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        num=[]
        for i in range(0,numRows):
            row=[1]*(i+1)
            for j in range(1,i):
                row[j]=num[i-1][j-1]+num[i-1][j]
            num.append(row)
        return num