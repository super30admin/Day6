#Time Complexity: O(n) 
#Space Complexity: O(n)
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        
        print(nums)
        total_sum = 0
        index_map = dict()
        index_map[0] = -1
        res = 0        
        for i, num in enumerate(nums):
            if num == 0:
                total_sum -= 1
            else:
                total_sum += 1
            if total_sum in index_map:
                res = max(res, i - index_map[total_sum])
            else:
                index_map[total_sum] = i
        return res
