#time=O(n); space = O(n)
def subarraySum(nums, k):
    cumulative_sum = 0
    count = 0
    sum_frequency = {0: 1}  # Initialize with sum 0 at frequency 1
    
    for num in nums:
        cumulative_sum += num
        
        # Check if (cumulative_sum - k) is in the hash map
        if cumulative_sum - k in sum_frequency:
            count += sum_frequency[cumulative_sum - k]
        
        # Add the current cumulative sum to the hash map
        if cumulative_sum in sum_frequency:
            sum_frequency[cumulative_sum] += 1
        else:
            sum_frequency[cumulative_sum] = 1
    print(sum_frequency)
    
    return count

# Example usage
# nums = [1, 1, 1]
# k = 2
# print(subarraySum(nums, k))  # Output: 2

nums = [1, 2, 3]
k = 3
print(subarraySum(nums, k))  # Output: 2

# nums = [1, -1, 0]
# k = 0
# print(subarraySum(nums, k))  # Output: 3
