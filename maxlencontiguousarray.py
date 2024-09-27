"""
https://leetcode.com/problems/contiguous-array/
Input: [0,1]
Output: 2
Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.
Three techniques to explore-maybe hashing
Approach- Whenever we are encountering 1, we are going to increase the count by 1 and whenever we are
encountering 0 we are going to decrease the count by 1, to check if we are having balanced array we will check
if the current running sum is already encountered before and stored in hashmap, if yes, we will subtract the
current index and the value of running sum already stored in hashmap and we will return the max value
TC: O(n)
SC:O(n)
submitted on leetcode- yes
"""

class Solution:
    def findMaxLength(self, nums) -> int:
        if len(nums)==0 or nums==None:
            return 0
        hashmap=dict()
        runningSum=0
        maxLength=0
        hashmap[0]=-1
        # maximum=0
        for i in range(len(nums)):
            if nums[i]==0:
                runningSum -= 1
            else :
                runningSum+=1
            if runningSum in hashmap.keys():
                maxLength=max(i-hashmap[runningSum], maxLength)
            else:
                hashmap[runningSum] = i
            # else:
            #     runningSum-=1
            # if not runningSum in hashmap.keys():
            #     hashmap[runningSum]=i
            # else:
            #     maxLength=i-hashmap[runningSum]
            #     startIndex=hashmap[runningSum]
            #     endIndex=i
            #     print("start and end indexes are", startIndex+1, endIndex)

        return maxLength


nums=[0,1,0]
solve=Solution()
print(solve.findMaxLength(nums))