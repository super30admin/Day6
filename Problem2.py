# Contiguous Array

# Time Complexity : O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : Yes, Runtime: 844 ms and Memory Usage: 18.7 MB
# Any problem you faced while coding this : No
# Your code here along with comments explaining your approach
# Approach
"""
Contiguous means adjacent. Using HashMap which contains key value pairs and has
key as running sum and value of index. If zero is encounterd subtract 1 else add 1 to
the count variable initialized. Current index - old index helps in retrieving index.

"""
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        if(nums==None or len(nums)==0): # Edge Cases Checking
            return 0
        rsum=0
        maximum=0
        hash_map = {0: -1} # Implementing hashmap
        for i in range(len(nums)): 
            if (nums[i]==0): # for every 0 encountered in array decrement running sum
                rsum=rsum-1
            else:
                rsum=rsum+1 # # for every 1 encountered in array increment running sum
            if rsum in hash_map:
                maximum=max(maximum,i-hash_map.get(rsum))
            else:
                hash_map[rsum]=i
        return maximum