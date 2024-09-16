"""

Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.

 

Example 1:

Input: nums = [0,1]
Output: 2
Explanation: [0, 1] is the longest contiguous subarray with an equal number of 0 and 1.

To find the maximum length, we need a dict to store the value of count (as the key) and
 its associated index (as the value). We only need to save a count value and its index 
 at the first time, when the same count values appear again, we use the new index subtracting 
 the old index to calculate the length of a subarray. A variable max_length is used to to keep
  track of the current maximum length.

Complexity
Time: O(N)
Space: O(N) hash can be oN in the worst case


"""

class Solution(object):
    def findMaxLength(self, nums):
        count = 0
        max_length=0
        table = {0: 0}
        for index, num in enumerate(nums, 1):
            if num == 0:
                count -= 1
            else:
                count += 1
            
            if count in table:
                max_length = max(max_length, index - table[count])
            else:
                table[count] = index
        
        return max_length