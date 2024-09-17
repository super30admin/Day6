#Time Complexity - O(n)
#Space Complexity - O(n) 

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        dict = {}
        dict[0] = 1
        ps = 0
        cnt = 0
        
        for x in nums:
            ps += x
            ex = ps - k
            if ex in dict:
                cnt += dict[ex]
            if ps not in dict:
                dict[ps] = 0
            dict[ps] += 1
        
        return cnt 