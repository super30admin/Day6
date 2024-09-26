#Running time complexity: O(n)
#Space Complexity: O(n)
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        hmap = {}
        rsum = 0
        hmap[0]=(-1)
        maxi = 0
        for i in range(len(nums)):
            if nums[i] == 0:
                rsum -=1
            else:
                rsum +=1
            if rsum in hmap:
                maxi = max(maxi,i-hmap[rsum])
            else:
                hmap[rsum]=i
        return maxi