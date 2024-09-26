 
    # 560. Subarray Sum Equals K

    # Time Complexity : O(n)
    # Space Complexity : O(1)
    # Did this code successfully run on Leetcode : Yes
    # Any problem you faced while coding this : No

class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        count = 0
        curr_sum = 0
        hash_set = {0:1}
        for i in range(len(nums)):
            curr_sum = curr_sum + nums[i]
            if curr_sum - k in hash_set:
                count += hash_set.get(curr_sum - k)
                
            if curr_sum in hash_set:
                hash_set[curr_sum] = hash_set.get(curr_sum) + 1
            else:
                hash_set[curr_sum] = 1
        return count