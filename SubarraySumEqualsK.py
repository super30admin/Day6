# Time Complexity: O(n), where n is the length of the input array `nums`.
# Space Complexity: O(n), due to the hash map used to store running sums.
# Approach: Used a hash map to store the frequency of running sums to find subarrays that sum to `k` in O(n) time.


class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        if len(nums) == 0:
            return False
        
        map = {}
        count = 0
        map[0] = 1
        rsum = 0 

        for i in range(len(nums)):
            rsum = rsum + nums[i]
            map[rsum] = map.get(rsum, 0) + 1
            if (rsum-k) in map:
                count = count + map[rsum-k]
        return count