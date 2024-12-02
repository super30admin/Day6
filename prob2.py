#Time Complexity : O(n)
#Space Complexity :O(n)
#Did this code successfully run on Leetcode :Yes
#Any problem you faced while coding this :No

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        dict = {}
        subArr = 0
        count =0
        for i in range (0,len(nums)):
            if nums[i] ==1:
                count+=1
            else:
                count += -1
            if count ==0:
                subArr = i+1
            if count in dict:
                subArr = max(subArr, i-dict[count])
            else:
                dict[count] = i
                
        return subArr
