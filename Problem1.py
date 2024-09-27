# Leetcode 560 -  Subarray Sum Equals K
# Time complexity - O(n)
# Space complexity - O(n)

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        cumulativeSum = 0
        
        hashmap = {0:1}
        count = 0
        for num in nums:
            cumulativeSum = cumulativeSum + num
            
            if cumulativeSum - k in hashmap:
                
                count = count + hashmap[cumulativeSum-k]
                
            if cumulativeSum not in hashmap:
                hashmap[cumulativeSum] = 1
            else:
                hashmap[cumulativeSum] = hashmap[cumulativeSum]+1
        
        return count
                 
                 