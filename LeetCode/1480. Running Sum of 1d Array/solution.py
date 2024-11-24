class Solution(object):
    def runningSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        l=[]
        for i in range(len(nums)):
            l.append(sum(nums[:i+1]))
        return l