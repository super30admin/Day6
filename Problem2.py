# Time Complexity: O(n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode: all test cases passed
# Any problem you faced while coding this: No

# Approach: Z=X-Y approach is used where Z and Y are the occurrencse of running sums at particular indices. If the running sum has 
# occured before, it means that the index differences would result in a sub-array with a difference of 0 or a balanced array.

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        
        rsum = 0
        mydict = {}
        mydict[0] = -1
        max_len = 0
        
        for idx,num in enumerate(nums):
            if num == 0:
                rsum = rsum - 1
            else:
                rsum = rsum + 1
            
            if rsum in mydict:
                length = idx - mydict[rsum]
                if length > max_len:
                    max_len = length
                
            
            else:
                mydict[rsum] = idx
        
        return max_len
        