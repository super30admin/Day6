"""
Name: Srinidhi Bhat
Space Complexity: O(n)
Time Complexity: O(n)

Did it run on leetcode: Yes
Logic: when you compute current sum, check if you have "seen curr_sum-k"
if you have, increment your ans by how many times you have seen the result
initially store 0:1 in map because for base cases it is needed.
"""
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        ans = 0
        my_hash = {0:1}
        curr_sum = 0
        
        for i in range(len(nums)):
            curr_sum+=nums[i]
            ans+=my_hash.get((curr_sum-k),0)
            
            my_hash[curr_sum] = my_hash.get(curr_sum,0)+1
        
        return ans