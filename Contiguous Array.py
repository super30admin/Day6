#Time= O(n), Space= O(n), if every element is 0 or 1
# Brute force
#class Solution:
#     def findMaxLength(self, nums: List[int]) -> int:
#         result= 0
#         for i in range(len(nums)):
#             count0, count1= 0,0
#             for j in range(i, len(nums)):
#                 if nums[j]==0:
#                     count0+=1
#                 else:
#                     count1+=1
#                 if count0== count1:
#                     result= max(result,count0+count1)
#         return result
class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        00011110000"""
        summ = 0
        d = {}
        ans = 0
        for i in range(len(nums)):
            if nums[i] == 0:
                summ-=1
            else:
                summ+=1
            if summ == 0:
                ans = i+1
            if summ in d:
                    ans = max(ans,i-d[summ])#3-1
            else:
                d[summ] = i
        return ans
    #d={-1:0,-2:1,-3:2, }