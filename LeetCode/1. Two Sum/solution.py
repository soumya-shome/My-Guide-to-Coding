class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        a,b,n=0,0,0
        
        for i in range(len(nums)):
            if nums[i]+nums[i]==target:
                a,b=1,1
                n=1
                break
        if n==1:
            print("found")