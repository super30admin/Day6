
"""
// Time Complexity : o(n), where n is the number of elements in nums
// Space Complexity : o(n), size of dictionary
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
"""

from collections import defaultdict
class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        d = defaultdict(int)
        
        rsum = 0 #running sume
        ctr = 0 
        d[0] = 1 #dummy, storing running sum as key and its number of occurance as value
        
        for i in nums:
            rsum = rsum + i 
            comp = rsum - k #calculate complement
            
            if comp in d: #check if complement exists
                ctr+= d[comp] #inc counter if it does
            
            d[rsum] = d[rsum] + 1 #adding rsum to dictionary
    
        return ctr