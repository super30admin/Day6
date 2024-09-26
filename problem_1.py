"""
Time limit exceeded on leetcode
Time complexity O(n^2)
Space Complexity O(1)
"""
class Solution(object):
    def find(self,arr,start,k):
        if start >= len(arr) :
            return 0 
        r1 = self.find_from_start(arr,start,k)
        r2 = self.find(arr,start+1,k)
        return r1 + r2 
    
    def find_from_start(self,arr,start,k):
        if start >= len(arr) :
            return 0        
        new_k = k - arr[start]
        return self.find_from_start(arr,start+1,new_k) + (1 if new_k ==0 else 0)
    
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        return self.find(nums,0,k)
