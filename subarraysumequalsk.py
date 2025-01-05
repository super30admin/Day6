class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        hashmap={}
        hashmap[0] = 1
        rsum = 0
        res = 0
        for no in nums:
            rsum+=no
            if (rsum-k) in hashmap:
                res+=hashmap[rsum-k]
            hashmap[rsum] = 1 + hashmap.get(rsum,0)
        return res
        