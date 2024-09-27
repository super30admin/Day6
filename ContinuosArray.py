#Time Complexity : O(N)
#Space Complexity : O(N) for storing the elements in hashmap
class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        d = {}
        d[0] = -1
        maxlength = 0
        sum = 0
        for i in range(len(nums)):
            if nums[i] ==0:
                sum = sum -1
            else:
                sum = sum+1
            if sum in d:
                maxlength = max(maxlength,i - d[sum])
            else:
                d[sum] = i
        return maxlength

