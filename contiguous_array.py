# Approach:
# Brute - Force: Iterate over the array with 2 for loops and at every iteration check if we have seen equal number of 0's & 1's
# Time complexity of above would be O(N^2)
# Space complexity - O(1)

# Optimized Solution
# We can keep track of the running sum and everyt instant we see '0' we decrement the sum by 1 and increment by 1 if we see a 1
# At the end, if the running sum is 0 --> This means we have seen equal number of ones and zeros
# But to keep track of what the longest such contiguos array we have seen we can use a dict which will store the sum at every iteration

# Time complexity: O(N)
# Space Complexity: O(N) where N will be the runningSum we store against each number we come across

def findMaxLength(nums):
    dict = {}
    maxSubArray = 0
    runningSum = 0
    
    for idx, val in enumerate(nums):
        
        if nums[idx] == 0:
            runningSum -= 1
        else:
            runningSum += 1
            
        if runningSum == 0:
            maxSubArray = idx + 1
            
        if runningSum in dict:
            maxSubArray = max(maxSubArray, idx - dict[runningSum])
            
        else:
            dict[runningSum] = val
            
    return maxSubArray


# Approach discussed in class
    def findMaxLength(nums):

        dict = {}
        dict[0] = -1 # base case when we deal with [0, 1] to count the valid length as 2
        runningSum = 0
        maxSubArray = 0

        for idx in range(len(nums)):
            if nums[idx] == 1:
                runningSum += 1
            else:
                runningSum -= 1

            if runningSum == 0:
                maxSubArray = idx

            if runningSum in dict.keys():
                maxSubArray = max(maxSubArray, dict[runningSum])

            else:
                dict[runningSum] = idx

