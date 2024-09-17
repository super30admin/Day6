# Time Complexity : o(n) 
# Space Complexity : o(n), to store rsum
# Did this code successfully run on Leetcode : Yes

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        rsum = [0]*len(nums)
        rsum_value = 0
        d = {}
        d[0] = -1           # to handle edge case in case first element is 0, for eg:[0,1]
        max_ = 0      

        for i in range(len(nums)):
            if nums[i] == 0:     # decreasing rsum if 0 is encountered, so that the difference is observed between 0's and 1's
                rsum_value -= 1
            else:
                rsum_value += 1
            rsum[i] = rsum_value
            if rsum_value not in d:  #the observed pattern shows that if value is seen before then the difference between current and seen index has equal no. of 0's and 1's
                d[rsum_value] = i
        
            if rsum[i] in d:
                tmp = i - d[rsum[i]]
                max_ = max(tmp,max_)
        return max_        
                