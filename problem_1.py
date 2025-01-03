#  Time Complexity : O(n)
#  Space Complexity : O(n)
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : No

#  https://leetcode.com/problems/subarray-sum-equals-k/description/
#  Your code here along with comments explaining your approach 
#  I created a hash map to store running sum and its count.

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        count = 0 
        running_sum = 0
        rs = {0: 1}
        for i in range(len(nums)):
            running_sum += nums[i]
            if (running_sum - k) in rs:
                count += rs[running_sum - k]
            rs[running_sum] =  rs.get(running_sum, 0) + 1
        return count
