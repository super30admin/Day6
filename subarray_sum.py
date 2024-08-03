#TC:O(n) SC: O(n)

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        hmap={}
        hmap[0] = 1
        rsum=0
        count=0

        for i in nums:
            rsum+=i

            if (rsum-k) in hmap:
                count+=hmap[rsum-k]
            if not rsum in hmap:
                hmap[rsum]=1
            else:
                hmap[rsum]+=1
        return count





