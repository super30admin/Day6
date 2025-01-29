'''
Time complexity: O(n)
Space complexity: O(n)
Did this code successfully run on Leetcode : Yes. (#560)
Any problem you faced while coding this : No.
Approach:
We maintain a hashmap to store the cumulative sum and the count of the subarrays that have the sum equal to k by using CumSum - k.
Edgecase We initialize the hashmap with 0:1 to handle the case when the cumulative sum is equal to k.
'''
from typing import List

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        prefixMap = {}
        cumSum = 0
        count = 0
        prefixMap[0]=1
        for idx, num in enumerate(nums):
            cumSum+=num
            if (cumSum - k) in prefixMap:
                count+=prefixMap[cumSum - k]
            
            if cumSum in prefixMap:
                prefixMap[cumSum]+=1
            else:
                prefixMap[cumSum]=1
        return count

#driver code
sol = Solution()
print(sol.subarraySum([1,1,1], 2)) #2
print(sol.subarraySum([1,2,3], 3)) #2