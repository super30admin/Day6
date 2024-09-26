"""
Time Complexity : O(n)
Space Complexity : O(n)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
"""
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        maxi = 0
        count = 0
        visitedCount = {0:-1}
        if len(nums) == 0:
            return 0
        else:
            # Looping through my array
            for i in range(len(nums)):
                # If i have 0 decrement count to 1
                if nums[i] == 0:
                    count -= 1
                # If I encounter 1 increment count to 1
                else:
                    count += 1
                # If the value not in map add it
                if count not in visitedCount:
                    visitedCount[count] = i
                # If the value is greater than max update maxi
                else:
                    maxi = max(maxi, i - visitedCount[count])
            return maxi