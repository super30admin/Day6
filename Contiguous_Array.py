
# Time Complexity : O(n) n is the length of nums array
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# 
# Here I maintained a cursum where  cursum decreases by 1 when it encounters 0, and increases by 1 when it encounters by 1. 
#Here I used a dictionary where I stored my cursum, If I already contains the cursum in the dict, 
#then from that point to current position I have number of zeroes and number of 1's equal. So I can subtract the i-dict[cursum]



class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        d = {0:-1}
        cursum = 0
        res = 0
        for i in range(len(nums)):
            cursum = cursum+1 if nums[i] else cursum-1
            if cursum in d:
                res = max(res, i-d[cursum])
            else:
                d[cursum] = i
        return res