"""

Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.

Example 1:
Input: nums = [0,1]
Output: 2

Example 2:
Input: nums = [0,1,0]
Output: 2

Time Complexity : O(N)
Space Complexity : O(N)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

"""

# Approach: Use a hashmap to store the first occurrence of a running count, which increases by 1 for '1' and decreases by 1 for '0'.  
# If the same count appears again, it means there is a subarray with an equal number of 0s and 1s, and we update the max length.  
# The hashmap helps in achieving an O(n) time complexity by ensuring we check the longest valid subarray efficiently.  

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:

        hmap = {0:-1}
        maxlen = 0
        count = 0

        for i, num in enumerate(nums):
            count += (1 if num == 1 else -1)
            if count in hmap:
                maxlen = max(maxlen, i-hmap.get(count))
            else:
                hmap[count] = i

        return maxlen
