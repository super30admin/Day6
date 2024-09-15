# Approach: We will use the technique running sum to find the number of arrays that add up to a value k
# For every number find the complement and check if it exists in the dict
# Time complexity: O(N)
# Space Complexity: O(N)

def subArraySum(arr, k):

    dict = {}
    dict[0] = 1
    count = 0
    runningSum = 0

    for idx in range(len(arr)):
        runningSum += arr[idx]
        complement = runningSum - target

        if complement in dict.keys():
            count += dict[complement]

        if runningSum not in dict.keys():
            dict[runningSum] = 1

        else:
            dict[runningSum] += 1

    return count
