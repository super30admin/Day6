class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        
        count = 0
        d = {0:-1}
        maxm = 0
        
        for i in range(len(nums)):
            if(nums[i]==0):
                count-=1
            elif(nums[i]==1):
                count+=1
            
            if(count in d):
                k = i-d[count]
                if(k>maxm):
                    maxm = k
            else:
                d[count]=i
        return maxm