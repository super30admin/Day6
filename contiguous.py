class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        
        cnt = 0
        max_len = 0
        dict= {}
        dict[0] = -1
        
        if(nums==None or len(nums) == 0): return 0
        
        for i in range(len(nums)):
            if nums[i] == 1:
                cnt =cnt + 1
            else:
                cnt =cnt - 1
                
            
            if dict.get(cnt) is None:
                dict[cnt] = i

            max_len = max(max_len, i-dict[cnt])
            
        return max_len