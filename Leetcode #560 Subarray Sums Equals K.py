# Time Complexity: O(n)
# Space Complexity: O(n)

class Solution:
    def subarraySum(nums, k):
        if len(nums) == 0 or nums is None:
            return 0

        dict = {}
        rsum = 0
        count = 0
        # [0,1,0,1]
        dict[rsum] = 1

        for i in range(len(nums)):
            rsum = rsum + nums[i]
            if rsum - k in dict:
                count = count + dict[rsum - k]
            if rsum in dict:
                dict[rsum] = dict[rsum] + 1
            else:
                dict[rsum] = 1
        
        return count
