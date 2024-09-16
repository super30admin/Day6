# Time Complexity: O(n)
# Space Complexity: O(n)
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        fmap={0:1}
        cSum=0
        count=0
        for i in range(len(nums)):
            cSum+=nums[i]
            if cSum-k in fmap:
                count+=fmap[cSum-k]
            if cSum not in fmap:
                fmap[cSum]=0
            fmap[cSum]+=1
        return count