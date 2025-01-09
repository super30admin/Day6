# Time complexity is O(n) - iterate through all the elements
# Space complexity is O(n) - store running sum of the elements
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : none
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        if not nums or len(nums) == 0:
            return 0
        
        max_length = 0
        rsum = 0
        hash_map = {0: -1}

        for i, num in enumerate(nums) :
            if num == 0:
                rsum -=1
            else:
                rsum += 1
            
            if rsum in hash_map:
                max_length = max(max_length, i - hash_map[rsum])

            else:
                hash_map[rsum] = i

        return max_length
        