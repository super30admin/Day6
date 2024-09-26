# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : N/A


# Your code here along with comments explaining your approach
# Same as previous question.
# Here 0 as -1 and our target is 0

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        nsum = 0
        dict1 = {}
        cnt = 0
        for i in range(len(nums)):
            if nums[i]:
                nsum += 1
            else:
                nsum -= 1
            if nsum == 0:
                cnt = i+1
            if nsum not in dict1.keys():
                dict1[nsum] = i
            else:
                cnt = max(cnt, i - dict1[nsum])
                
        return cnt