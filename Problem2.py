#Time Complexity : O(n)
#Space Complexity : O(n)
#Did this code successfully run on Leetcode : YES
#Any problem you faced while coding this : NO
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        summ = 0
        maxx = 0
        dic = {0:-1}
        for i in range(0,len(nums)):
            if nums[i] == 1:
                summ +=1
            else:
                summ -=1
                
            if summ not in dic:
                dic[summ] = i
            else:
                temp = i - dic[summ]
                maxx = max(maxx,temp)
                
        return maxx
                
            