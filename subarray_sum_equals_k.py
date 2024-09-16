class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        
        
        sm = 0
        hm = {0:1}
        count = 0
        
        for i in range(len(nums)):
            sm += nums[i]
            
            x = sm - k
            if x in hm:
                count += hm[x]
            
            if sm in hm:
                hm[sm] += 1
            else:
                hm[sm] = 1
            
            #print(hm, sm, count)
        
        return count
            
        