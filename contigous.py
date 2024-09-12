class Solution(object):
    def findMaxLength(self, nums):
        aux = {0:-1}
        count = 0
        result = 0
        for i in range(len(nums)):
            if nums[i]==0:
                count-=1
            else:
                count+=1
            if count ==0:
                result = i+1
            if count in aux:
                result = max(result,i-aux[count])
            else:
                aux[count]=i
        return result
