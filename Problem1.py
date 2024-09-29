# Time Complexity : O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        map = {}
        map[0] = 1
        count = 0 
        rSum = 0
        
        for i in range(len(nums)):
            rSum += nums[i]
            cmp = rSum - k
            if cmp in map:
                count += map[cmp]

            map[rSum] = map.get(rSum, 0) + 1

        return count
                

