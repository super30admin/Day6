# accepted in leet code
# time - O(N), space - O(N)
# Using a hashmap to maintain start index of the nums sub array
def findMaxLength(nums):
    map = {}
    max_len = 0
    map[0] = -1  # base case
    curr_sum = 0
    for i in range(len(nums)):
        # if the current number is 1, add it or if the number is 0 then substract 1 from the curr_sum.
        curr_sum = curr_sum + (1 if nums[i] == 1 else -1)
        if curr_sum in map.keys():
            # if the sum already there in hashmap, check which one is higher length.
            max_len = max(max_len, i - map[curr_sum])
        else:
            map[curr_sum] = i

    return max_len

print(findMaxLength([1,1,0,1,0,1,0,1,0,1,1,0]))