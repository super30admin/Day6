# Time Complexity: O(n)
# Space Complexity: O(n)

class Solution:
    def findMaxLength(nums):
        if len(nums) == 0 or nums is None:
            return 0

        dict = {}
        rsum = 0
        maximum = 0
        # [0,1,0,1]
        dict[0] = -1

        for i in range(len(nums)):
            if nums[i] == 1:
                rsum += 1
            else:
                rsum -= 1

            if rsum in dict:
                maximum = max(maximum, i - dict[rsum])
            else:
                dict[rsum] = i
        
        return maximum
