#subarray sums equals k

# // Time Complexity : O(N)
# // Space Complexity :O(N)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :was confused at first, but the lecture made it clear


def subarraySum( nums, k) -> int:
    hash_array ={}
    hash_array[0]=1
    count =0
    result=0
    for i in range(len(nums)):
        count+=nums[i]
        diff = count-k
        if diff in hash_array:
            result += hash_array[diff]
        hash_array[count]=hash_array.get(count,0)+1
    return result



#test

print(subarraySum([3,4,7,2,-3,1,4,2,0,1], 7))