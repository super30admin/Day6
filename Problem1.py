class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        r_sum = 0
        count = 0
        hashmap = {0:1}
        
        for i in range(len(nums)):
            
            r_sum += nums[i]
            
            if r_sum - k in hashmap:
                count += hashmap[r_sum-k]            
            
            if r_sum not in hashmap:
                hashmap[r_sum] = 1
            else:
                hashmap[r_sum] += 1
            
            
        print(hashmap)
        return count
    

#Time complexity and Space complexity is O(n)