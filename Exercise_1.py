"""
Time Complexity:    O(n)
Space Complexity:   O(n)
YES, The code successfully ran on Leetcode

Approach - My approach is pretty straight forward, I am using hashmaps to store
sub arrays sum
"""
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        if nums is None or len(nums) == 0:
            return False
        rsum, hp, count = 0, dict(), 0
        hp[0] = 1
        for i in nums:
            rsum += i
            diff = rsum - k
            if diff in hp:
                count += hp[diff]
            hp[rsum] = hp.setdefault(rsum,0) + 1
        return count