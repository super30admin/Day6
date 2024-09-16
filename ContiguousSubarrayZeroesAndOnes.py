# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# We decrement current sum by 1 if we encounter a zero and add one if we encounter one. We maintain the sums and earliest indexes at which
# they have occured. If the sum occurs again then that means the subarray between those indexes are balanced.
# Only earliest index is maintained as we ant the maximum length.

from typing import List
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        res=0
        maxVal=float('+inf')
        curSum=0
        prefixSum={0:-1}

        for i in range (len(nums)):
            if nums[i]==0:
                curSum-=1
            else:
                curSum+=1
            if curSum in prefixSum.keys():
                res=max(res,i-prefixSum.get(curSum))   
            prefixSum[curSum]=min(prefixSum.get(curSum,maxVal),i)

        return res         
                
obj=Solution()
print(obj.findMaxLength([0,1,0,0,1,1]))