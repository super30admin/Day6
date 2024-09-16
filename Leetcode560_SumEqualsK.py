#Time Complexity: O(n)
#Space Complexity: O(n)

from collections import defaultdict


class Solution:
    def subarraySum(self, nums, k: int) -> int:
        total=0
        sums=defaultdict(int)
        running_sum=0
        for num in nums:
            running_sum += num
            if running_sum==k:
                total+=1
            if running_sum - k in sums:
                total+=sums[running_sum - k]
                
            sums[running_sum]+=1
        return total
        