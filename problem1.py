class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        if len(nums)==0:
            return 0
        
        sumMap = {0:1}
        rSum = 0
        count = 0
        
        for i in range(0, len(nums)):
            rSum = nums[i]
            K= rSum-k
            if 'K' in sumMap:
                count += sumMap[K]
            if rSum in sumMap:
                sumMap = sumMap[rSum]+1
            else:
                sumMap[rSum] = 1
        return count
        
