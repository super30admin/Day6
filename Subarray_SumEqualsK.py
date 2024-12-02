# TC : O(N)
# SC : O(N) as prefix sum can keep on increasing in hash map with num of elements in array

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        hmap = {0:1}
        count = 0
        prefixSum = 0
        
        for i in nums:
            prefixSum += i
        
            if (prefixSum-k) in hmap:
                count += hmap[prefixSum-k]
                
            if prefixSum in hmap:
                hmap[prefixSum] += 1
            else:
                hmap[prefixSum] = 1
                
        return count
