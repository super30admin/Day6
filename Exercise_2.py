# Time Complexity: O(n) 
# Space Complexity: O(n)
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this : No

class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        res = 0
        maximum = 0
        hashmap = {}
        hashmap[0] = -1
        for i in range(len(nums)):
            s = 1 if nums[i]==1 else -1
            res+=s
            if res in hashmap:
                maximum = max(maximum, i-hashmap[res])
            else:
                hashmap[res] = i
                
        return maximum
            