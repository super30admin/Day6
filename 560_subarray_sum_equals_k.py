# TC: O(n)
# SC: O(n)  

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        rSum = 0
        rMap = {0:1}
        count = 0
        
        for elem in nums:
            rSum += elem
            if (rSum - k) in rMap:
                count += rMap.get(rSum-k)
            if rSum in rMap:
                rMap[rSum] += 1
            else:
                rMap[rSum] = 1
                
            
        return count
