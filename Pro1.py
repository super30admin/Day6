#Time Complexity: O(n) 
#Space Complexity: O(1)
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        
        count = {0:1}
        cur, res = 0, 0
        for n in nums:
            cur += n
            res += count.get(cur - k, 0)
            count[cur] = count.get(cur, 0) + 1
            
        return res