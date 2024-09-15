# The problem can actually be boiled down to the longest subarray with sum 0 after changing all 0's to -1's

# Time:O(N)
# Space:O(N)

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        
        for i, num in enumerate(nums):
            if num==0:
                nums[i]=-1
        
        check_map={0:-1}
        
        ans=0
        curr_sum=0
        for i, num in enumerate(nums):
            curr_sum+=num
            if curr_sum-0 in check_map:
                ans=max(ans, i-check_map[curr_sum])
            
            if curr_sum not in check_map:
                check_map[curr_sum]=i
        
        return ans