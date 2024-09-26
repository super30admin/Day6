# Time Complexity : O(N), traversisng elements in array, hashmap search is constant time
# Space Complexity : O(N),
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

class Solution(object):
    def subarraySum(self, nums, k):
        count = 0
        maps = {}
        maps[0] = 1
        r_sum = 0
        
        for elem in nums:
            r_sum += elem
            complement = r_sum -k 
            if complement in maps:
                count += maps[complement]
            
            if r_sum in maps:
                maps[r_sum] += 1
            else:
                maps[r_sum] = 1
        
        return count