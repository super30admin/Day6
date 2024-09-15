# Time Complexity: O(n)
# Space Complexity: O(n)

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        hash1={}
        maxLen=0
        hash1[0]=-1
        prefixSum=0
        for i in range(len(nums)):
            prefixSum+=nums[i] if nums[i]==1 else -1
            
            if prefixSum in hash1:
                len1=i-hash1[prefixSum]
                maxLen=max(maxLen,len1)
                
            else:
                hash1[prefixSum]=i
                
        return maxLen