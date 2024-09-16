# Time Complexity: O(n)
# Space Complexity: O(nums)
# Did this code successfully run on Leetcode: all test cases passed
# Any problem you faced while coding this: No

# Approach: Calculate the running sum for each index by storing in a variable called rsum. Put/ update the count of the variable 'diff'. 
# 'diff' is the difference between rsum at that index and the sum 'k'. If that 'diff' has happened before in the list, that is, it exists
# in the dictionary, then increment the count by the number of its occurences, else just add the current rsum to the dictionary.


class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        
        mydict= {}
        mydict[0] = 1
        rsum = 0
        count = 0
        
        
        for num in nums:
            rsum = rsum + num
            diff = rsum - k
            if diff in mydict:
                count = count + mydict[diff]
            if rsum in mydict:
                mydict[rsum] += 1
                
            else:
                mydict[rsum] = 1
        return count