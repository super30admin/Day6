class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        Hmap={}
        prefixSum=0
        count=0
        for i in range(len(nums)):
            prefixSum+=nums[i]
            
            if prefixSum==k:
                count+=1
            if prefixSum-k in Hmap:
                count+=Hmap[prefixSum-k]
            
            if prefixSum not in Hmap:
                Hmap[prefixSum]=1
            else:
                Hmap[prefixSum]+=1
            
        return count

# Time Complexity: O(n) where n is the number of elements in num
# Space Complexity: O(n) since we use Hashmap