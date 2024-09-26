# Time Complexity : O(N) where N is the length of nums
# Space Complexity : O(N), worst case the sumIndex dictionary can have the running sum for all elements in the array which is all 0's or all 1's
# 525. Contiguous Array


def findMaxLength(nums):
    if len(nums) <= 1: return 0
    rSum, maxlen = 0,0
    sumIndex = {0:-1}
    for i in range(len(nums)):
        if nums[i] == 0: rSum -= 1
        else: rSum += 1
        
        if rSum not in sumIndex:
            sumIndex[rSum] = i
        else:
            maxlen = max(maxlen, i-sumIndex[rSum])
    return maxlen


nums = [1,1,0,0,1,1,0]
print(findMaxLength(nums))
print(findMaxLength([1,1]))