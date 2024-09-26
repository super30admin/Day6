# Time complexity O(n) and space complexity O(n)
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
#Initializing hashmap
        h={0:1}
        s=0
        c=0
        for i in nums:
            s+=i            
            if s-k in h:
                c+=h[s-k]
            if s in h:
                h[s]+=1
            else:
                h[s]=1
                
        return c
