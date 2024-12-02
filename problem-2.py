class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        mapping = {}    
        longest = 0     
        total = 0       

        for i, num in enumerate(nums):
            current = 1 if num == 1 else -1
            total += current
            if total == 0:
                longest = max(longest, i + 1)
            elif total in mapping:
                longest = max(longest, i - mapping[total])
            else:
                mapping[total] = i
        
        return longest