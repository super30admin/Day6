class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        
        if len(nums) == 0:
            return 0
        
        count = 0
        d = {}
        d[0] = 1
        res = 0
        
        for i in range(len(nums)):
            count += nums[i]
            diff = count - k
            if diff in d:
                res += d.get(diff)
            d[count] = d.get(count, 0) + 1
                    
        return res
