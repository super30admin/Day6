class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        dict1 = {}
        maxlen =0
        count = 0
        for i in range(len(nums)):
            if nums[i]==1:
                count+=1
            else:
                count -=1
            if count ==0:
                maxlen = i+1
            if count in dict1:
                maxlen = max(maxlen, i-dict1[count])
            else:
                dict1[count] = i
                
        return maxlen
