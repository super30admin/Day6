# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

def findMaxLength(nums):
    seen = {}
    seen[0] = -1
    sum = 0
    maxSum = 0
    for i in range(0,len(nums)):
        if nums[i] == 0:
            sum -= 1 
        else:
            sum += 1
        if sum in seen:
            maxSum = max(maxSum, i - seen[sum])
        else:
            seen[sum]=i
    return maxSum
            
nums = [0,1,0]
print(findMaxLength(nums))