class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        dict ={}
        count,maxsub=0,0
        for i in range(len(nums)):
            if nums[i]==0:
                count-=1
            else:
                count+=1
            if count ==0:
                maxsub=i+1
            if count in dict:
                maxsub=max(maxsub, i- dict[count])
            else:
                dict[count]=i
        return maxsub
                
#Completed