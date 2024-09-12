"""
Subarray Sum
Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.

Example 1:

Input:nums = [1,1,1], k = 2
Output: 2
Constraints:

    The length of the array is in range [1, 20,000].
    The range of numbers in the array is [-1000, 1000] and the range of the integer k is [-1e7, 1e7].
"""
def SubArray(nums):
    sumdict = { 0:1}
    n = len(nums)
    count = 0
    s = 0
    for num in nums:
        s += num
        if s-k in sumdict:
            count += sumdict[s-k]
        if s in sumdict:
            sumdict += 1
        else:
            sumdict[s] = 1
    print(count)

"""
Time Complexity : O(n)
Space Complexity: O(n)

"""

"""

Find the cumulative sum of the array.
Subtract the cumulative sum from the value k, if the difference exist in the dictionary, increase the count by value in the dict for that number.
If not, add the element to dictionary with value as 1
Finally count contains the number of time elements adds up to k.

"""     
