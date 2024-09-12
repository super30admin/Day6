 # Time Complexity : O(n)
 # Space Complexity : O(n)
 # Did this code successfully run on Leetcode : Yes
 # Any problem you faced while coding this : None
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        hashmap = {}
        hashmap[0] = 1
        a_sum = 0
        count = 0
        for i in range(len(nums)):
            a_sum += nums[i]
            if (a_sum-k) in hashmap:
                count += hashmap[a_sum-k]
            if a_sum not in hashmap:
                hashmap[a_sum] = 1
            else:
                hashmap[a_sum] = hashmap[a_sum] + 1
        return count
