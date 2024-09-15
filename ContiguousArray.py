class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        Hmap={0:-1}
        prefixSum=0
        result=0
        
        for i in range(len(nums)):
            
            if nums[i]==0:
                prefixSum+=-1
            elif nums[i]==1:
                prefixSum+=1
            
            
            if prefixSum not in Hmap:
                Hmap[prefixSum]=i
            else:
                result=max(result,i-Hmap[prefixSum])
        
        return result

# Time complexity: O(n)
# Space complexity: O(n