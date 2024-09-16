# Time Complexity : BruteForce: O(n^2), Optimized: O(n)
# Space Complexity : BruteForce: O(1), Optimized: O(n)
# Did this code successfully run on Leetcode :Yes
# Any problem you faced while coding this : Thinking the optimized solution

class Solution(object):
    def subarraySumBruteForce(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        counter = 0
        for i in range(len(nums)):
            summ = 0
            for j in range(i, len(nums)):
                summ += nums[j]
                if summ == k:
                    counter += 1
        return counter

    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        counter, lookup, cumSum = 0, {0:1}, 0
        for num in nums:
            cumSum += num
            if cumSum-k in lookup:
                counter += lookup[cumSum-k]
            if cumSum not in lookup:
                lookup[cumSum] = 1
            else:
                lookup[cumSum] += 1
        return counter
        
obj = Solution()
nums, k = [1,1,1],  2
print(obj.subarraySumBruteForce(nums, k))
print(obj.subarraySum(nums, k))

nums, k = [1,-1,1,0,1, 0, 2],  2
print(obj.subarraySumBruteForce(nums, k))
print(obj.subarraySum(nums, k))