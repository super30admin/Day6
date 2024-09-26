# Time Complexity : O(N), traversisng elements in array, hashmap search is constant time
# Space Complexity : O(N), 
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

class Solution(object):
    def findMaxLength(self, nums):
        count = 0
        maxi = 0
        count_map = {}
        count_map[0] = -1
        
        for i in range(0, len(nums)):
            if nums[i] == 0:
                count = count -1
            else:
                count = count + 1
            
            if count in count_map:
                maxi = max(maxi, i- count_map[count])
            else:
                count_map[count] = i
        return maxi
        
