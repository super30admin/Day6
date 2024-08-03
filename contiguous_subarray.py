# TC: O(n) SC: O(n)

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0
        hMap={}
        sum1=0
        max1= 0
        hMap[0]= -1       
        for i in range(len(nums)):
            if nums[i] == 0:
                sum1 -=1
            else:
                sum1+=1
            if sum1 not in hMap:
                    hMap[sum1] = i
            else:
                max1 = max(max1, (i - hMap[sum1]))
        return max1



    
        