############## Find maximum length of a contiguous subarray in a binary array with an equal number of 0 and 1.  ######

# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Compute the running sum for each element if the current sum 
# is not in the map add and store the index
# and if it is in the map subtract the curr index with
# the first seen index and take maximum to get max length.

def find_max_length(nums):
    if len(nums)<=1:
            return 0
    curr_sum = 0
    index_map = {}
    index_map[0] = -1
    max_len = 0
    for i in range(len(nums)):
        if nums[i] == 0:
            curr_sum -= 1
        else:
            curr_sum +=1
        if curr_sum in index_map:
            max_len = max(max_len, i - index_map[curr_sum])
        else:
            index_map[curr_sum] = i
    return max_len

print(find_max_length([0,1,0]))
