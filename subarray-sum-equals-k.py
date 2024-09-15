# Time: O(n)
# Space: O(n)

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        dic={}
        dic[0]=1
        prefixSum=0
        count=0
        
        for i in range(len(nums)):
            prefixSum+=nums[i]
            
            excess=prefixSum-k
            
            if excess in dic:
                count+=dic[excess]
            
            if prefixSum in dic:
                dic[prefixSum]+=1
            else:
                dic[prefixSum]=1
        return count