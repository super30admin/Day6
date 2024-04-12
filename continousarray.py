# // Time Complexity : O(n) 
# // Space Complexity : O(1) as we only store first occurance of difference
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : no


# // Your code here along with comments explaining your approach

# Intution: we keep count i.e difference at each index and , 
# if we encounter same count while looping through , we understand that , we have same no of 0's and 1's 
# and we take the difference with the frist index in hashmap to the recent value of index , 
# we encounter same count , we take max value of difference of index 

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:

        count = 0 
        max_length = 0
        c_map = {0: -1}

        for i in range(len(nums)):
            if nums[i] == 0:
                count -= 1
            else:
                count += 1
            
            if count in c_map:
                max_length = max(max_length, i - c_map[count])
            else:
                c_map[count] = i

        return max_length