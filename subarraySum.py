def subarraySum(nums, k):
    count = 0
    for i in range(len(nums)):
        for j in range(i + 1, len(nums) + 1):
            if sum(nums[i:j]) == k:
                count += 1
    return count
    
    
#Time Complexity: O(n³) due to three nested loops
#Time Complexity: O(n) as it only requires a single pass through the array
