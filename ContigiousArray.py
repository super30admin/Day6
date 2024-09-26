#time complexity:o(n) 
#space complexity: o(n) 
#passed all cases on LeetCode: yes

class Solution:
    def findMaxLength(self, nums: list[int]) -> int:
        if not nums or len(nums) == 0: return 0
        
        nMap = {}
        nMap[0] = -1
        rSum = 0
        length = 0
        
        for i in range(len(nums)):
            if nums[i] == 1:
                rSum = rSum+1
            else:
                rSum = rSum-1
                
            if rSum in nMap:
                length = max(length, i-nMap.get(rSum))
            else:
                nMap[rSum] = i
        return length