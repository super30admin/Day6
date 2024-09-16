"""
Problem: Contiguous Array
Leetcode: https://leetcode.com/problems/contiguous-array/
Time Complexity: O(n)
Space Complexity: O(n)
"""


class Solution:
    def findMaxLength(self, nums):
        # Define a hashmap with default values to cover corner case
        hmap = {0:-1}
        count = 0
        max_length = 0

        for i in range(len(nums)):
            if nums[i] == 0:
                count -= 1
            else:
                count += 1

            if count not in hmap.keys():
                hmap[count] = i
            else:
                max_length = max(max_length, i - hmap[count])
        return max_length


# Driver Code
obj = Solution()
print(obj.findMaxLength([0,1]))
print(obj.findMaxLength([0,1,0,1,1]))