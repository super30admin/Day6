# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# We maintain a dict which will contain the sums which we have seen till now. If the value of current sum minus K
# equals an value which we have  already seen before that means the sum between that index and current index is equal to k. 

from typing import DefaultDict, List
from collections import defaultdict
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        res=0
        curSum=0
        prefixSums={0:1}

        for i in nums:
            curSum+=i
            diff=curSum-k

            res+=prefixSums.get(diff,0)
            prefixSums[curSum]=1+prefixSums.get(curSum,0)
        return res


obj=Solution()
print(obj.subarraySum([1,-1,0],0))