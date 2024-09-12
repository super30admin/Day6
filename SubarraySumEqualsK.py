# Time complexity : O(n)
# Space complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Yes, couldn't identify the trick of finding a difference and storing it in hashmap. Had to look through solution

import collections


class Solution:
    def subarraySum(self, nums, k):
        hmap = collections.defaultdict(int)
        hmap[0] = 1
        currentSum = 0
        count = 0
        if not nums:
            return count

        for i in range(len(nums)):
            currentSum += nums[i]
            if currentSum-k in hmap:
                count += hmap[currentSum-k]
            hmap[currentSum] += 1
        return count


solution = Solution()
print(solution.subarraySum([1, 1, 1], 3))
print(solution.subarraySum([1, 2, 3], 3))
print(solution.subarraySum([1, 2, 3, 3, 4, 5], 3))
