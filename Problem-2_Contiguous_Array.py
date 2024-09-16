# APPROACH 1: BRUTE FORCE (MY APPROACH) 
# Time Complexity : O(n^3) - n is the length of nums
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : No (TIME LIMIT EXCEEDED)
# Any problem you faced while coding this : None
#
#
# Your code here along with comments explaining your approach
# 1. Consider different subarrays by varying start and end positions
# 2. For each subarray, count the number of 0 and 1
# 3. If count of 0 and count of 1 is same then check if the current length is greater than the max length found so far. Update accordingly.

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        
        if not nums:
            return 0
        
        max_len, count_0, count_1 = 0, 0, 0
        
        for start in range(0, len(nums)):
            for end in range(start + 1, len(nums)):
                for ind in range(start, end + 1):
                    
                    if nums[ind] == 0:
                        count_0 += 1
                        
                    elif nums[ind] == 1:
                        count_1 += 1
                        
                if count_0 == count_1:
                    curr_len = end - start + 1
                    max_len = max(max_len, curr_len)
                    
                count_0, count_1 = 0, 0
                
        return max_len
        
        
        
# APPROACH 2: BRUTE FORCE SOLUTION (From class) 
# Time Complexity : O(n^2) - n is the length of nums
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : NO (Time Limit Exceeded)
# Any problem you faced while coding this : None
#
#
# Your code here along with comments explaining your approach
# 1. Vary the start index from 0 till end of list
# 2. For each start pos compute the sum in this way -> for 0: add 1 and for 1: add -1, till end of list
# 3. Each time the sum is computed, check if it's equal to 0 -> then update the max length found so far
   
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        
        if not nums:
            return 0
        
        max_len = 0
        for start in range(len(nums)):
            curr_sum = 0
            for ind in range(start, len(nums)):
                if nums[ind] == 0:
                    curr_sum += 1
                elif nums[ind] == 1:
                    curr_sum -= 1
                    
                if curr_sum == 0:
                    max_len = max(max_len, ind - start + 1)
                    
        return max_len
        
        
        
        
# APPROACH 3: OPTIMAL SOLUTION
# Time Complexity : O(n) - n is the length of nums
# Space Complexity : O(n) - size of hashmap
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None
#
#
# Your code here along with comments explaining your approach
# 1. Store hashmap where key is the sum and value is the lowest index at which this sum was obtained
# 2. for each element of the list, compute the sum in this way -> for 0: add 1 and for 1: add -1
# 3. Check if the sum exist in hashmap (x - k, but k is 0 here), if so, update the max length found so far.
#                                                                 Else, store the sum in hashmap and the index. (don't update when we find the same sum again as we need to 
#                                                                       find the longest length here, so we need lowest index possible)  
 
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        
        if not nums:
            return 0
        
        hashmap, curr_sum, max_len = {0: -1}, 0, 0
        for ind in range(len(nums)):
            
            if nums[ind] == 0:
                curr_sum += 1
                
            elif nums[ind] == 1:
                curr_sum -= 1
               
#             DOMINIC'S WAY
#             if curr_sum == 0:
#                 max_len = ind + 1
                
#             if curr_sum not in hashmap:
#                 hashmap[curr_sum] = ind
#             else:
#                 max_len = max(max_len, ind - hashmap[curr_sum])
                
            if curr_sum in hashmap:
                max_len = max(max_len, ind - hashmap[curr_sum])
                
            if curr_sum not in hashmap:
                hashmap[curr_sum] = ind
                  
        return max_len
        
