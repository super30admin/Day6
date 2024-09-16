class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        my_dict={0:-1}
        count=0
        maxlen=0
        for i in range(0,len(nums)):
            if nums[i]==1:
                count+=1
            else:
                count-=1
            
            if count in my_dict:
                maxlen=max(maxlen,i-my_dict[count])
            else:
                my_dict[count]=i
        
        return maxlen