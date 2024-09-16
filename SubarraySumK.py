# TC = O(n)
# SC = O(n)
# Similar to contiguous array problem. Here, we track the running sum by adding each subsequent number. we save running sums with their count.Each iteration we check compliment of current running sum(running sum - k) exits in the map. If it does - it means we can form subarray with sum 7 using those previous subarrays.
from collections import defaultdict
def subarraySum(nums, k):
    if nums == None or len(nums) == 0:
        return 0
    rSum = 0
    map = defaultdict(int)
    map[0] = 1
    count = 0
    for i in range(len(nums)):
        rSum += nums[i]
        compliment = rSum - k
        if compliment in map:
            count += map[compliment]
        map[rSum] += 1
    return count

nums = [1,1,1]
k = 2
print(subarraySum(nums, k))
