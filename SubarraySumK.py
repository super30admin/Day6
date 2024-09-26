# Time Complexity : O(N) where N is the length of nums
# Space Complexity : O(N) worst case we store sum for each element in nums and there are no repeating sums
# 560. Subarray Sum Equals K

def subarraySum(nums, k):
    rSum, count = 0, 0
    sumCount = {0:1}
    for i in range(len(nums)):
        rSum += nums[i]
        
        if rSum-k in sumCount:
            count += sumCount[rSum-k]
        
        if rSum in sumCount:
            sumCount[rSum] += 1
        else:
            sumCount[rSum] = 1
            
    return count



print(subarraySum([1,2,1,2,1], 3)) #4
print(subarraySum([1,2,3,0,5,8,2,6,4], 10)) #3