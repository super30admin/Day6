"""
Given an array of integers nums and an integer k, return the total number of continuous subarrays whose sum equals to k.

Example 1:
    Input: nums = [1,1,1], k = 2
    Output: 2

Example 2:
    Input: nums = [1,2,3], k = 3
    Output: 2
"""

"""
Brute Force
    Iterate the loop twice maintaining the running sum
    if running sum equals to K increase the counter

    def subarraySum(self, nums: List[int], k: int) -> int: 
        counter = 0
        for i in range(len(nums)):
            runningSum = 0
            for j in range(i, len(nums)):
                runningSum += nums[j]
                if(runningSum == k):
                    counter += 1
        return counter

    the above solution time complexity is O(n2)

    the running time can be improved by using hashing
    maintain the runningSum as keys in map/dictionary,
    if running sum is already in the map, increase its count by 1
    check the difference of runningSum and K, if its already present in map 
    increase the counter(number of subarrays) by 1.
    In this solution we iterate the array only once - bringing down the complexity to O(n)
    and space complexity would be O(n)
"""
def subArraySum(nums, k):
    runningSum = 0
    sumDict ={}
    sumDict[0] = 1
    count = 0
    for num in nums:
        runningSum += num
        if(runningSum - k in sumDict):
            count += sumDict[runningSum-k]
        sumDict[runningSum] = sumDict.get(runningSum, 0) + 1
    return count

print(subArraySum([1,1,1], 2))
print(subArraySum([1,2,3], 3))
print(subArraySum([1,2,3], 8))