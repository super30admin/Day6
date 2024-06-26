#time=O(n); space = O(n)

def findMaxLength(nums):
    # Dictionary to store the first occurrence of each cumulative sum
    sum_indices = {0: -1}  # Initialize with sum 0 at index -1
    cumulative_sum = 0
    max_length = 0
    
    for i, num in enumerate(nums):
        # Update the cumulative sum: treat 0 as -1 and 1 as 1
        cumulative_sum += 1 if num == 1 else -1
        
        if cumulative_sum in sum_indices:
            # Calculate the length of the subarray with sum zero
            max_length = max(max_length, i - sum_indices[cumulative_sum])
        else:
            # Store the first occurrence of the cumulative sum
            sum_indices[cumulative_sum] = i
    print(sum_indices)
    
    return max_length

# nums = [0, 1, 0, 1, 0]
# print(findMaxLength(nums))  # Output: 4

# nums = [1,1,1,0,1,0,0]
# print(findMaxLength(nums))  

nums = [1, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1]
print(findMaxLength(nums))  # Output: 10