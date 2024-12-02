# TC: O(N)
# SC: O(N)

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        hmap = {0:-1}
        count = 0
        prefixSum = 0
        
        for i in range(len(nums)):
            if nums[i] == 0:
                prefixSum +=-1
            else:
                prefixSum += 1
                
            if prefixSum not in hmap:
                hmap[prefixSum] = i
            else:
                count = max(count, i-hmap[prefixSum])
        
        return count
