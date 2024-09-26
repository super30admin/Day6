#time complexity:o(n) 
#space complexity: o(n) 
#passed all cases on LeetCode: yes

class Solution:
    def subarraySum(self, nums: list[int], k: int) -> int:
        if not nums or len(nums) == 0: return 0
        nMap = {}
        nMap[0] = 1
        rSum = 0
        count = 0        
        for i in range(len(nums)):
            rSum = rSum + nums[i]
            
            if rSum-k in nMap:
                count = count + nMap.get(rSum-k)
            if rSum in nMap:
                nMap[rSum] += 1
            else:
                nMap[rSum] = 1
        
        return count
        