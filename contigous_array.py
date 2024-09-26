# Time Complexity : O(n) = n
# Space Complexity : O(n) = n
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No problems after learning the solution in class

#Approach:
# Using running sum approach. Storing the running sum and index in a Map at each index and looking for rSum 
# If found that means that from that index we have equal number of ones and zeros. Comparing the length of this
# with previous max length gives max_length in the end.

from collections import defaultdict
class Solution:
    def findMaxLength(self, nums):
        mapping = defaultdict(lambda: None)
        mapping[0] = -1
        rSum = 0
        max_length = 0
        for i, num in enumerate(nums):
            rSum = rSum + 1 if num == 1 else rSum - 1
            previous = mapping[rSum]
            if previous is not None:
                length = i - previous
                if max_length < length:
                    max_length = length
            else:
                mapping[rSum] = i
        return max_length

if __name__ == "__main__":
    s = Solution()
    print(s.findMaxLength([0,1,0]))