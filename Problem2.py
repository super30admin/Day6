#### Time Complexity: O(n) entire array traversed once

# Space Complexity: O(n) for the hash map

# Did it run on Leetcode:Yes

# Approach:
#if we encounter 0, we add 1 to count else we subtract.
# The no of zeroes and ones will be equal when this sum is 0. but we will have occureences where our sum will be imbalanced initially due to inequality and then we come accross a balanced subarray.
# Here the sum of sub array needs be be the sum we encountered before this subarray +0(sum of the balanced subarray)
#Therefore we maintain a hashamp of all the sums we countered at their corresponding index. maxlen will be the difference in the index when we find the same sum
class Solution:
    def findMaxLength(self, nums):
        maxlen = 0
        sum = 0
        counts = {0: -1}
        for i, j in zip(nums, range(len(nums) + 1)):
            if i == 0:
                sum += 1
            else:
                sum -= 1
            if sum in counts:
                maxlen = max(maxlen, j - counts[sum])
            else:
                counts[sum] = j

        return maxlen


s = Solution()
print(s.findMaxLength([1, 1, 0, 0, 1, 0]))
