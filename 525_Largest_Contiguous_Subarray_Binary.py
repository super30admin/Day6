# Leetcode problem link : https://leetcode.com/problems/contiguous-array/
# Time Complexity : O(n) 
#  Space Complexity : O(n)
#  Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
'''
        Basic approach : O(n2) => check for all subarrays from each starting point and check the number of zeroes and ones at each position, restart with count 0 from next index and keep repeating

        Optimized approach: The main idea of this approach is to add 1 when we encounter 0 and reduce 1 from count when we encounter 1. This helps to keep track of number of zeroes and ones at each index and also when count becomes zero that means starting from first index till that index there are equal number of zeroes and ones which will be max till now.
        The sum at each index can be used to calculate the length of the first index when it was first encountered (fetched from hashmap) and hence calculate the length of the subarray with equal number of zeroes and ones
'''
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        # initialize variables
        max_len = 0
        index_map = {}
        count = 0
        
        # iterate through the array
        for index,num in enumerate(nums):
            # increase count if element is zero
            if num == 0:
                count += 1
            # decrease count if element is one
            elif num == 1:
                count -= 1
            # if count becomes zero then it means current index is the longest subarray
            if count == 0:
                max_len = index + 1
            
            # calculate the new max if current count is present in the hash map
            if count in index_map:
                max_len = max(index - index_map[count], max_len)
            # if its not present then just add it 
            else:
                index_map[count] = index
        # return max length
        return max_len
        