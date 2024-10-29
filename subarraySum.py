"""
TC: O(n) iterate over all elements calculate running sum
SC: O(n) to store running sim in hmap
"""
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        hmap = {0:1}
        rsum = 0
        res = 0
        for n in nums:
            rsum+=n
            if rsum-k in hmap:     
                res+=hmap[rsum-k]
            hmap[rsum] = hmap.get(rsum, 0) +1
        return res
            
