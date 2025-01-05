class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        hashmap = {}
        hashmap[0] = -1
        rsum = 0
        res = 0
        for i, no in enumerate(nums):
            if no == 0:
                rsum-=1
            elif no == 1:
                rsum+=1
            if rsum in hashmap:
                res = max ( res, i-hashmap[rsum])
            else:
                hashmap[rsum] = i
        return res