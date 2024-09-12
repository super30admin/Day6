# Time Complexity: O(n)
# Space Complexity: O(n)
# Ran on Leetcode: Yes

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        if len(nums) == 0:
            return 0
        count = 0
        rsum = 0
        map = {0:1}
        for elem in nums:
            rsum += elem 
            diff = rsum - k
            if diff in map:
                count += map[diff]
            if rsum in map:
                map[rsum] += 1
            else:
                map[rsum] = 1
        return count
        