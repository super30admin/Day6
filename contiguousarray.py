# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode :
# // Any problem you faced while coding this :


# // Your code here along with comments explaining your approach 
# Just convert 0s to -1 and find the longest subarray with 0 sum.

def findMaxLength(self, nums: List[int]) -> int:
        if len(nums)==1:
            return 0
        for i,ele in enumerate(nums):
            if ele == 0:
                nums[i] = -1
        ans = 0
        freq = {0:-1}
        prefix = 0
        for i,ele in enumerate(nums):
            prefix = prefix+ele
            if prefix in freq:
                ans = max(ans,i-freq[prefix])
            else:
                freq[prefix] = i
        return ans

