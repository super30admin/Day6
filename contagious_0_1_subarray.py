class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        d = {0:-1}
        rs = 0
        mx = 0
        for idx,i in enumerate(nums):
            if i == 0:
                rs -=1 
            else:
                rs += 1
                
            if rs in d:
                mx = max(mx,idx-d[rs])
                
            else:
                d[rs] = idx
                
        return mx
