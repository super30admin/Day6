# T.C = O(n) S.C = O(n)
# Calculate the running sum and based on that find the earliest index
class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """

        if(nums == 0 or len(nums)==0 or len(nums)==1):
            return 0

        hashMap = {0:-1}

        max_len = 0
        rSum = 0

        for i in range(len(nums)):
            if(nums[i]==0):
                rSum = rSum - 1
            else:
                rSum = rSum + 1
            
            if rSum in hashMap:
                max_len = max(max_len,i-hashMap[rSum])
            else:
                hashMap[rSum] = i

        return max_len 
        