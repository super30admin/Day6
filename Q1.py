############## Subarrays that sum to k  ######

# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Initially confused between using sliding window or hashing + prefix sum

# compute the prefix sum if the prefix sum - k is in the array add the number of times which we have seen
# to the total count if the prefix sum is not in the map add it and set it to 1 and if the prefix
# sum is in the map increment by 1 to keep track of the number of times we encountered the prefix


def find_subarray_sums(nums, k):
    count = 0
    curr_sum = 0
    index_map = {}
    index_map[0]=1
    for i in range(len(nums)):
        curr_sum += nums[i]
        if (curr_sum - k) in index_map:
            count += index_map[curr_sum-k]
        if curr_sum in index_map:
            index_map[curr_sum] += 1
        else:
            index_map[curr_sum] = 1
    return count

print(find_subarray_sums([1,-1,0],0))
