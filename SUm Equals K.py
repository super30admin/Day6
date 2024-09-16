# Time: O(n)
#Space: O(n)
# Run on Leetcode: Yes

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        rsmap = {}
        rsmap[0] = 1
        rsum = 0
        count = 0
        for i in range(len(nums)):
            rsum += nums[i]
            if (rsum - k) in rsmap:
                count += rsmap[rsum - k]
            if rsum in rsmap:  # for updating the val in hashmap
                val = rsmap[rsum]  # taking file
                val += 1  # puting val
                rsmap[rsum] = val  # puting it back
            else:
                rsmap[rsum] = 1
        return count