# Time Complexity: O(n)
# Space Complexity: O(n)

class Solution:
    
    def subarraySum(self, nums: List[int], k: int) -> int:
        rsum = 0
        count = 0
        smap = {}
        smap[0] = 1
        for i in range(len(nums)):
            rsum = rsum+nums[i]
            if (rsum-k) in smap.keys():
                count = count+smap[rsum-k]
                
            if rsum not in smap.keys():
                smap[rsum] = 1
            else:
                smap[rsum] = smap[rsum]+1
        return count