def findMaxLength(nums):
    count = 0
    maxLength = 0
    map = {0: -1}  # Initialize map with sum zero at index -1

    for i in range(len(nums)):
        count += 1 if nums[i] == 1 else -1

        if count in map:
            maxLength = max(maxLength, i - map[count])
        else:
            map[count] = i

    return maxLength
    

#Time Complexity: O(n) - because the algorithm makes a single pass through the array⁠ 1
⁠
#Space Complexity: O(n) - due to the hashmap storing cumulative counts and their indices
