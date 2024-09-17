# Time Complexity: O(n)
# Space Complexity: O(n)

class Solution:
    
    def findMaxLength(self, nums: List[int]) -> int:
        max_len = 0
        rsum = 0
        smap = {}
        smap[0] = -1
        for i in range(len(nums)):
            if nums[i]==0:
                rsum = rsum-1
            else:
                rsum = rsum+1
                
            if rsum in smap:
                max_len = max(max_len,i-smap[rsum])
            else:
                smap[rsum] = i
        return max_len
            