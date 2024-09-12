 #Time Complexity : O(N ) where N is number of elements
# Space Complexity : O(N) 
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this :
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        if nums is None or len(nums) == 0:
            return 0
        hashmap = {}
        rsum = 0
        total = 0
        hashmap[0] = 1
        for i in range(0,len(nums)):
            rsum = rsum + nums[i]
            if rsum - k in hashmap:
                total = total + hashmap[rsum - k]

            if rsum not in hashmap:
                hashmap[rsum] = 1
            else:
                hashmap[rsum] = hashmap[rsum] + 1

        return total
        