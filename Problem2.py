# Hashing-2
## Problem2 (https://leetcode.com/problems/contiguous-array/)

#Approach
# create a hashmap and initialize it with running sum of 0 at index -1. This will help with certain cases with less number of elements like [0,1,0,1].
# Calculate the running sum by reducing the count by 1 if element is 0 else increment count by 1. If running sum count not in hashmap, add it as the key and corresponding index as the value
# Else, if running sum present in hashmap, calculate the length by subtracting current length- index value in hashmap and update the max_length variable

# Time Complexity: O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        cnt = 0
        hmap = {0:-1}
        max_len = 0

        for i in range(len(nums)):
            if nums[i] ==0:
                cnt -= 1
            else:
                cnt += 1
      
            if cnt not in hmap:
                hmap[cnt] = i
            else:
                max_len = max(max_len,i-(hmap[cnt]))
      
        return max_len
