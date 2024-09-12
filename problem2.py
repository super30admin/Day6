#Time complexity O(n)

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
      
        s=0
        maxl=0
        h={0:-1}
        for i in range(len(nums)):
            
            if nums[i] == 0:
                s-=1
            else:
                s+=1
                
            if s in h:
                maxl=max(maxl,i-h.get(s))
            else:
                h[s]=i
            
            
        return maxl
