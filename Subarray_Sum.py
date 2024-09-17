class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        
        hash1 = {}
        hash1[0] = 1
        res = 0
        sum = 0
        for i in range(len(nums)):
            
            sum = sum + nums[i]
            if sum - k in hash1.keys():
                res += hash1[sum-k]
            
            if sum not in hash1.keys():
                hash1[sum] = 0
                
            hash1[sum] += 1
            
        return res
                