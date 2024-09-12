"""
Intuition: Keep a track of the count. If num is 0, count-=1 else count += 1
Using this approach, we always find a balanced ( number of O's = number of 1's) in the array.
#####################################################################
For hashing:
Time Complexity : O(N)  N = number of elements
Space Complexity : O(N) 
#####################################################################
"""
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        
        
        counts = {0:-1}
        count = 0
        maxLength = 0
        for i in range(len(nums)):
            
            num = nums[i]
            if num == 0:
                count -= 1
            elif num == 1:
                count += 1
            
            if count in counts:
                maxLength = max(maxLength, i - counts[count])
            else:
                counts[count] = i
        
        return maxLength