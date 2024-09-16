# sc O(n)
# tc avg O(1)
from typing import List


class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        hashmap = dict()
        hashmap[0] = -1
        
        rsum = 0
        maxlen = 0
        
        for i in range(len(nums)):
            if nums[i] ==0:
                rsum = rsum -1
            else:
                rsum = rsum + 1
        
            if rsum in hashmap:
                maxlen = max(maxlen, i - hashmap[rsum])
            else:
                hashmap[rsum] = i
       
        return maxlen