from typing import List

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        rSum = 0
        count = 0
        map = {}
        map[0] = 1
        
        for i in range(0,len(nums)):
            rSum += nums[i]
            if (rSum - k) in map.keys():
                count += map[rSum - k]
            if rSum not in map.keys():
                map[rSum] = 1
            else:
                map[rSum] = map[rSum] + 1
            
        return count

obj = Solution()
print(obj.subarraySum([1,1,1], 2))
print(obj.subarraySum([1,2,3], 3))
print(obj.subarraySum([3,4,7,2,-3,1,4,2,0], 7))

# Time Complexity : O(n)
# Space Complexity : O(n)
                