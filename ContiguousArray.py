# Time Complexity : O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
# Used Hashmap to store indices to find maximum subarray with equal number of zeroes and ones


class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        dict = {0: -1}
        count = 0
        maxcount = 0
        for i in range(len(nums)):
            if nums[i] == 0:
                count -= 1
            else:
                count += 1
            if count not in dict:
                dict[count] = i
            else:
                maxcount = max(maxcount, i - dict[count])

        return maxcount
