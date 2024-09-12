# Time Complexity : O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Somewhat while trying to code it.. not until I was
#  able to draw it out. 

# Your code here along with comments explaining your approach


class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        """
        Initial thoughts:
            - Can do N^2 solution that checks for possible subArrays.. 
            - To change O(n^2) -> O(N)..can use hashmap..how??
        
        Reminded me of the TwoSum problem of using the complement            
        Have some kind of ongoing total count when we go over nums array. 
        After writing it out I can see if subarray of sum k has occurred where I update 
        the totalSubArrays mapped to that total-k.
        """
        occurrence = defaultdict()
        subArrays = 0
        total = 0
        
        occurrence[0] = 1
        
        for i in range(len(nums)):
            total += nums[i]
            
            if total - k in occurrence:
                subArrays += occurrence[total-k]
            
            if total not in occurrence:
                occurrence[total] = 1
            else:
                occurrence[total] += 1
        #print(occurrence)
        return subArrays