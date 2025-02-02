#  Time Complexity : O(n)
#  Space Complexity :O(n)
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : No

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        #In a balanced array the count be will be zero

        freqSeen = {0: -1}  
        longest = 0
        count = 0

        for i in range(len(nums)):
            if nums[i] == 1:
                count +=1
            else :
                count -= 1

            if count not in freqSeen:
                freqSeen[count] = i
            else:
                earliestIndex = freqSeen[count]
                longest = max(i-earliestIndex, longest)
        return longest

        