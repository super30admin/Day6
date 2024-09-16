class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        data = dict()
        max_c = 0
        cur=0
        data[0]=-1
        for x in range(len(nums)):
            if nums[x] == 1:
                cur+=1    
            else:
                cur-=1
            
            if cur in data:
                max_c = max(max_c,x- data.get(cur))
            else:
                data[cur] = x
        return max_c        
            
                
        
          
