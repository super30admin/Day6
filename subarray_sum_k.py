from typing import List
# tc O(n)
# sc O(n)

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        rsum_map = dict()
        rsum_map[0] = 1
        rsum = 0
        count = 0
        
        for i in range(len(nums)):
            rsum = rsum + nums[i]
            if (rsum - k) in rsum_map:
                count += rsum_map[rsum - k] # think abou this
            if rsum not in rsum_map:
                rsum_map[rsum] = 1
            else:
                rsum_map[rsum] += 1
            
            
        return count        
                
        