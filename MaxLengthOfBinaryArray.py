# Time complexity : O(n)
# Space complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Concepts were clear after the class

import collections


class Solution:
    def findMaxLength(self, nums):
        # hmap[curSum] = startindex
        hmap = collections.defaultdict(int)
        maxLen = 0
        curSum = 0
        # init hashmap with [0]-> -1 (you can set it to 0, if you do this you'd have to do end-start+1 for length. Setting it to -1 takes care of that indexing)
        hmap[0] = -1
        for end in range(len(nums)):
            # when 0 -> -1 and when 1 -> 1
            curSum += 1 if nums[end] == 1 else -1

            if curSum in hmap:
                maxLen = max(maxLen, end-hmap[curSum])
            else:
                hmap[curSum] = end
        return maxLen


solution = Solution()
print(solution.findMaxLength([0, 1, 0, 1]))
print(solution.findMaxLength([0, 1]))
