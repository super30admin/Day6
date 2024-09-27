# Time complexity -> O(n)
# Space complexity -> O(n)

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        if not nums:
            return 0
        
        hashMap = {0:1}
        total = 0
        count = 0
        
        for i in range(len(nums)):
            total += nums[i]
            if total-k in hashMap:
                count += hashMap[total-k]
                
            hashMap[total] = hashMap.get(total,0) + 1
                
        return count