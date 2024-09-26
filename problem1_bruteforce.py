#Brute force

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        from collections import defaultdict
        counts = {}
        total = 0
        res = 0
        counts.defaultdict(lambda : 0)
        for i in range(0,len(nums)):
            total = total + nums[i]
            if total == k:
                res = res + 1
            if (total-k) in counts.keys():
                res = res + counts[total-k]
            counts[total] += 1
        return res
        
     