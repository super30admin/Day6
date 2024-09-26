class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        count = 0
        max_diff = 0
        d = {}
        d[0] = -1
        
        for i in range(len(nums)):
            if nums[i] == 0:
                count -= 1
            else:
                count += 1
            if count not in d:
                d[count] = i
            else:
                diff = i - d[count]
                max_diff = max(diff, max_diff)
                
        return max_diff
