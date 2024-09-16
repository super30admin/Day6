# Time Complexity : O(N) for single pass for loop
# Space Complexity : O(N) for dict
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No



class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        rsum = 0
        res = 0
        mydict = {}
        mydict[0] = 1
        for i in range(len(nums)):
            rsum += nums[i]
            if (rsum - k) in mydict:
                res += mydict[rsum - k]
            if rsum in mydict:
                mydict[rsum] += 1
            else:
                mydict[rsum] = 1
        
        return res
