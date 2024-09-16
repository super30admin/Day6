"""
Problem: Subarray Sum Equals K
Leetcode: https://leetcode.com/problems/subarray-sum-equals-k/
Time complexity : O(n). The entire nums array is traversed only once.
Space complexity : O(n). Hashmap can contain upto n distinct entries in the worst case.
"""

class Solution:
    def subarraySum(self, nums, k):
        count = 0
        curr_sum = 0
        # Define hashmap
        hmap = {}

        for i in range(len(nums)):
            curr_sum += nums[i]
            if curr_sum == k:
                count += 1
            if (curr_sum - k) in hmap.keys():
                count += hmap[curr_sum - k]
            if curr_sum not in hmap.keys():
                hmap[curr_sum] = 0
            hmap[curr_sum] = hmap.get(curr_sum)+1
        return count


# Driver code
obj = Solution()
nums = [3,4,0,2,0,7]
k = 7
print(obj.subarraySum(nums, k))