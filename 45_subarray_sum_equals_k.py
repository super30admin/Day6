# Time complexity - O(n)
# Space complexity - O(1)

# Approach - Maintain rSum : freq map. Only append count if (rSum - k) is in the map

from typing import List
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        rSum = 0
        Map = {}
        # Map[0] = 1
        count = 0

        for n in nums:
            rSum += n
            if (rSum - k) in Map:
                count += Map[rSum - k]
            
            if rSum not in Map:
                Map[rSum] = 1
            else:
                Map[rSum] += 1
        
        if k in Map:
            count += Map[k]
        return count