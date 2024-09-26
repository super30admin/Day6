#Time Complexity: O(n)
#Space Complexity: O(n)
#Successfully ran on leetcode

class Solution:
    def findMaxLength(self, nums: list(int)) -> int:
        d = {}
        d[0]=-1
        count = 0
        length = 0
        for i in range(len(nums)):
            if nums[i]==0:
                count-=1
            else:
                count+=1
            if count in d:
                length = max(length,i-d[count])
            else:
                d[count]=i
        return length