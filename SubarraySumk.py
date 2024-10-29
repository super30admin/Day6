def subarraySum(nums, k) -> int:
    sum = 0
    count = 0
    arr = []
    result = {0 : 1}
    for i in range(len(nums)):
        sum = sum + nums[i]
        if sum-k in result:
            count = count + result[sum-k]
        if sum in result:
            result[sum] += 1
        else:
            result[sum] = 1
    return count
        
        


nums = [-1, -1, 1]

[-1,-2,-1]
k = 0

print(subarraySum(nums,k))