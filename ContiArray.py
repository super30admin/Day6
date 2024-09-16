# TC = O(n)
# SC = O(n)
# Using running sum algorithm. Maintain runningSum while traversing the array with sub by -1 for 0 and add 1 for 1. We keep storing the max rein of running sum with its latest index. We check for max running Sum each iteration.
def contiArray(nums):
    if not nums or len(nums) == 0:
        return 0
    max_, map, rSum = 0, {}, 0
    map[0] = -1
    for i in range(len(nums)):
        rSum =  rSum-1 if nums[i] == 0 else rSum+1
        if rSum in map:
            max_ = max(max_, i-map[rSum])
        else:
            map[rSum] = i
    return max_

nums = [0,1,0]
print(contiArray(nums))    
    
