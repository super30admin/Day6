"""
contiguous Array
Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.

Example 1:

Input: [0,1]
Output: 2
Explanation: [0, 1] is the longest contiguous subarray with equal number of 0 and 1.

Example 2:

Input: [0,1,0]
Output: 2
Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.

Note: The length of the given binary array will not exceed 50,000.

"""
def contiguousArray(nums):
    dict1= {}
    subarray, count = 0
    for i in range(len(nums)):
        if nums[i]==1:
            count += 1
        else:
            count -=1
        if count in dict1 :
            subarray = max(subarray, i-dict1[count])
        else:
            dict1[count] = i
    return subarray

"""
Time Complexity: O(n)
Space Complexity: O(1)

"""

"""
Go through the array, whenever 1 comes across, add 1 to count else minus one from the count.Add the count to dictionary
If count already exist in the dictionary, store the max count value in subarray.
return Subarray which will hold the continuous array which hold 0 and 1.

"""  
