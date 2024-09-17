"""
https://leetcode.com/problems/contiguous-array/
Approach: Linear traversal with calculating running sum and using hashmap to store it for each index
So for each index, we calculate rSum - if value at index is 0, reduce sum by 1, if its 1 - increase sum by 1
for each sum check if it is in the map, if not, add it as {sum:index} pair
If it is already in the map, take max of maxSoFar, i - map[rSum] 
Return maxSoFar as length of maximum balanced array.

TC O(n)
SC O(n)
"""

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        d = {0: -1} # add for base case
        rSum, maxM = 0, 0
        for i, n in enumerate(nums):
            rSum = rSum + 1 if n else rSum - 1
            if rSum in d: # if we have seen the rSum before
                maxM = max(maxM, i - d[rSum]) # then maxM len becomes max(maxM, index - previous index where rSum was seen)
                # to print the array we use d[rSum]+1 to current index (+1 because in python slice is [i:j))
                # where j is not inclusive
                # print(nums[d[rSum]+1:i+1])
            else:
                d[rSum] = i
        return maxM