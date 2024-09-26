#contiguous array

# // Time Complexity : O(N)
# // Space Complexity :O(N)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :was confused at first, but the lecture made it clear


def findMaxLength( nums):
    if (len(nums)==1):
        return 0
    
    count =0
    result =0
    hash_array = {}
    hash_array[0]=-1
    for i in range(len(nums)):
        if nums[i] == 0:                            #subtract 1 if the number is 0
            count-=1
        else:
            count+=1                                # add 1 if the number is 1
        if count in hash_array:                     # find the maximum length by subtracting the current index to the index of the previous count of the same number
            maximum = i-hash_array[count]
            if maximum > result:
                result=maximum
        else:
            hash_array[count] = i                   #if the count doesnt exist, add it to the hashmap
    return result

#testing
print(findMaxLength([1,0,1,0,1,1,1,1,0,0,1,0]))