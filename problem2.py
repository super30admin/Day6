class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        counts = {0:-1}
        
        max_length = 0
        count = 0
        
        if len(nums) == 0:
            return 0
        
        for i in range(0, len(nums)):
            if nums[i] == 0:
                count += -1
            else:
                count += 1

            if count in counts:
                print(counts[count])
                max_length = max(max_length, (i - counts[count]))
            else:
                counts[count] = i
        
        return max_length
