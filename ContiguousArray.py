# Contiguous Array
# Time Complexity : O(n); n = length of the array
# Space Complexity : O(n); n = length of hashmap
# Did this code successfully run on Leetcode : Yes
# Approach: In this approach, we make use of a cumulative sum, which is used to store the relative number of ones and zeros encountered so far while traversing the array. It will be incremented by one for every 1 encountered and the same is decremented by one for every 0 encountered. Then we store the sum (if its not present) in the hashmap as key and the index upto which it sums upto as value. 

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        curr_sum = 0
        count = 0
        hmap = {}
        hmap[0] = -1
        n = len(nums)
        
        for i in range(n):
            if nums[i] == 0:
                curr_sum += -1
            else:
                curr_sum += 1
            
            
            if curr_sum in hmap:
                count = max(count, i - hmap[curr_sum])
            else:
                hmap[curr_sum] = i
                
        return count
                
            
                
            
    
        