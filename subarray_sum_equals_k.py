# Time Complexity : o(n) 
# Space Complexity : o(n) for storing rsum
# Did this code successfully run on Leetcode : Yes

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        rsum = [0]*len(nums)
        rsum_value = 0
        count_ = 0
        d = {}
        d[0] = 1 #edge case, for eg [3,4]
        
        for i in range(len(nums)):
            rsum_value += nums[i]
            rsum[i] = rsum_value
            tmp = rsum[i] - k    # rsum - target = value, if value is seen then the difference between the seen index and current is equal to target
            if tmp in d:
                count_ += d[tmp] 
            if rsum[i] in d:
                d[rsum[i]] += 1
            else:
                d[rsum[i]] = 1            
        return count_