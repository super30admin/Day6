'''
T.C: O(n)
S.C: O(n)

Intuition: 

Calculate the prefix sum and difference between any prefix sum - prefix sum calcuate in previous idx = k 
X - Y = k => X - k = Y , if its there, then we have the subarray sum 

'''
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        if not nums:
            return 0
        
        total = 0
        num_len = len(nums)
        hmap = {0:1}
        prefix_sum = 0
        
        # X - k = Y
        
        for idx in range(num_len):
            prefix_sum += nums[idx]
            # print(prefix_sum - k, idx, hmap)
            if prefix_sum - k in hmap:
                total += hmap[prefix_sum - k]
            hmap[prefix_sum] = hmap.get(prefix_sum, 0) + 1
        
        return total
        
        
        
        
        
        
        