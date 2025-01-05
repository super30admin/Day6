# Time Complexity : O(n), where n is the number of elements in nums
# Space Complexity : O(n), where n is the number of elements in nums
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA 

# Your code here along with comments explaining your approach:
class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        # base case
        if nums is None or len(nums) == 0:
            return 0
        # intializing variables
        map = {}
        count = 0
        rSum = 0
        map[0] = 1
        
        for i in range(len(nums)):
            # incrementing the running sum
            rSum = rSum + nums[i]
            # checking if running sum - k exists as a key in the map
            # because if so, we would have added the k to get the current running sum
            if rSum - k in map:
                # if so, we increase the value of count
                count = count + map[rSum - k]
            
            #map[rSum] = map[rSum] + 1
            # 0 is the default value if rSum does not exist in the map
            map[rSum] = map.get(rSum, 0) + 1

        return count

        