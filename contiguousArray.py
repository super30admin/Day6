#Leetcode Problem: 525
#Add -1 to count if 0 else add 1 to count. Check in dictionary if we already have seen that count.
#if we have seen it subtract that index from current and compare with maxCount.

class Solution:
    def findMaxLength(self, nums):
        count=0
        maxCount=0
        d={0:-1}#used so that we dont miss [0,1] and [1,0] condition.
        for i in range(len(nums)):
            if nums[i]==0:
                count-=1
            else:
                count+=1
            if count not in d:
                d[count]=i
            else:
                maxCount=max(maxCount,i-d[count])
        return maxCount

#TC: O(n)
#SC: O(n)