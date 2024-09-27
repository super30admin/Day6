#time complexity  O(n)
#leetcode submission : Wrong Answer
# problems : cannot understand how to compute the max length 
class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        count=0
        ml=0
        for i in range(len(nums)-1):
            if nums[i]==0:
                count=count-1
            else:
                count=count+1
            if (count==0):
                ml=max(ml,len(nums)-1-i)
        return ml