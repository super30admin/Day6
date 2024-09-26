#Running time complexity: O(n)
#Space Complexity: O(n)
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        rsum = 0
        hmap = {}
        count = 0
        hmap[rsum]=1
        for i in range(len(nums)):
            rsum += nums[i]
            if (rsum-k) in hmap:
                count+= hmap[rsum-k]
            if rsum not in hmap:
                hmap[rsum]=0
            hmap[rsum]+=1
        return count 
           