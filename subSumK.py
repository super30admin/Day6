Time Complexity:O(n); n is the ength of nums list
Space Complexity: O(n)
 

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        
        mapNums = dict()
        mapNums[0] = 1
        res = 0
        rSum = 0
        for num in nums:
            rSum += num
            if rSum-k in mapNums:
                res += mapNums[rSum-k]
                
            if rSum in mapNums:
                mapNums[rSum] += 1
            else:
                mapNums[rSum] = 1
                
        return res
            
        
