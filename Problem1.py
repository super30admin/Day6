# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : 
# Your code here along with comments explaining your approach
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        hmap = {}
        hmap[0] = 1
        current_sum = 0
        count = 0
        for num in nums:
            current_sum += num
            if (current_sum - k) in hmap:
                count += hmap[(current_sum - k)]
            if current_sum in hmap:
                hmap[current_sum] += 1
            else:
                hmap[current_sum] = 1
        return count
