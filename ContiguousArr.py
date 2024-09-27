class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        
        count = {}
        count[0]=-1
        zero = 0
        maxLength = 0
        for i in range(len(nums)):
            
            if(nums[i]==1):
                zero+=1
            else:
                zero-=1

            if(zero in count):
                
                maxLength = max(maxLength,i-count[zero])
            else:
               
                count[zero]= i
        print(count)
        return maxLength