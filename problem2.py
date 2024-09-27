""" 
Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.

Input: [0,1]
Output: 2
Explanation: [0, 1] is the longest contiguous subarray with equal number of 0 and 1.

Input: [0,1,0]
Output: 2
Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.

Solution:
Brute force:
    iterate loop twice, in the second loop get the count of ones and zeros.
    if ones and zero are same update the maxlength 
    def findMaxLength(self, nums: List[int]) -> int:
        maxSum = 0
        for i in range(len(nums)):
            ones = 0
            zeros = 0
            for j in range(i, len(nums)):
                if(nums[j]==1):
                    ones+=1
                if(nums[j]==0):
                    zeros+=1
                if(ones == zeros):
                    maxSum = max(j-i+1, maxSum)
        return maxSum
    
    above solution is O(n2)

    we shall use dictonary and reduce the running time to O(n)
    maintain a runningSum and iterate list, if element is equal to one increase the running sum by 1
    and decrease by 1 if element is zero.
    if this runningSum is not present in dictionary add runningSum as key and current index as value
    else if runningSum is present in dictionary update maxLength to (i - myDict[runningSum])

    time Complexity = O(n)
    space complexity = O(n)
"""

def findMaxLength(nums) -> int:
    if(nums==None or len(nums)==0):
        return 0
    myDict, runningSum, maxLength= {}, 0, 0
    myDict[runningSum] = -1
    for i in range(len(nums)):
        runningSum = runningSum+1 if (nums[i]==1) else runningSum-1
        if(runningSum not in myDict):
            myDict[runningSum] = i
        else:
            maxLength = max(i - myDict[runningSum], maxLength)
    return maxLength            

print(findMaxLength([0,1,0,1,1]))
print(findMaxLength([1,1,1]))
print(findMaxLength([0,1,1,0,1,0,1]))