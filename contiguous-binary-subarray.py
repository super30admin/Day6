'''
Time complexity: O(n)
Space complexity: O(n)
Did this code successfully run on Leetcode : Yes. (#525)
Any problem you faced while coding this : No.
Approach:
We iterate over the array and maintain a cumulative sum. If we encounter 1, we increase the sum by 1 and if we encounter 0, we decrease the sum by 1.
We maintain a hashmap to store the cumulative sum and the index at which it was encountered. If we encounter the same cumulative sum again, we calculate the length of the subarray and update the maxLength.
We don't update the index if the cumulative sum is already present in the hashmap as we want to find the longest subarray.
EdgeCase: We start with a cumulative sum of 0 at index -1 to handle the case when the subarray starts from the beginning of the array.
'''
from typing import List

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        countMap = {}
        cumSum = 0
        maxLength = 0
        countMap[0] = -1
        for idx, n in enumerate(nums):
            if n == 1:
                cumSum+=1
            else:
                cumSum-=1
            if cumSum in countMap:
                maxLength = max(maxLength, idx - countMap[cumSum])
            else:
                countMap[cumSum] = idx
        return maxLength

#driver code
sol = Solution()
print(sol.findMaxLength([0,1])) #2
print(sol.findMaxLength([0,1,0])) #2
print(sol.findMaxLength([0,1,0,1])) #4