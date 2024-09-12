#Time complexity: O(n)
#Space complexity: O(n)

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        d = {0 : 1}
        count = 0
        cumsum = 0
        
        for i in range(len(nums)):
            cumsum += nums[i]
            if cumsum-k in d:
                count += d[cumsum-k]
            if cumsum not in d:
                d[cumsum] = 1
            else:
                d[cumsum] += 1
                                
        return count
            
