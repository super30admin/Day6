# Subarray Sum Equals K

# Time Complexity : O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : Yes, Runtime: 248 ms and Memory Usage: 16.8 MB
# Any problem you faced while coding this : No
# Your code here along with comments explaining your approach
# Approach
"""
A HashMap is used which stores key value pairs. Running sum is the key and
count of running sum/frequency of running sum as value. Compliment between runningsum and K is calculated and checked.
Count is incremented if the ccompliment is presnt in hasshmap.

"""
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
   
        rsum = 0
        count = 0
        
        # {sum: seen_count}
        hash_map = {0: 1} # Implementing hashmap
        
        for i in nums:
            rsum=rsum+i 
            count =count+ hash_map.get(rsum - k, 0) # calculating compliment
            hash_map[rsum] = hash_map.get(rsum, 0) + 1
            
        return count