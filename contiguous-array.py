# Time Complexity: O(n)
# Space Complexity: O(n)
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        cSum=0
        fmap={0:-1}
        maxi=0
        for i in range(len(nums)):
            if nums[i]==0:
                cSum-=1
            if nums[i]==1:
                cSum+=1
            if cSum in fmap:
                maxi=max(maxi,i-fmap[cSum])
            else:
                fmap[cSum]=i
        return maxi