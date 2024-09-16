# // Time Complexity : O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No
# // Your code here along with comments explaining your approach:
# Iterate through the array, and maintain a running sum. Create a hashmap, and store running sum as keys. For each running sum, check if running sum - k is present
# in the hashmap. If it is present, increase the count by number of its occurances/value of (running sum - k) in the hashmap. If running sum is not present,
# add it to hashmap, and assign its value to 1.


def subarraySum(nums, k) -> int:

    if len(nums) == 0:
        return 0

    hashmap = {}
    hashmap[0] = 1
    running_sum = 0
    count = 0
    for idx, element in enumerate(nums):
        running_sum += element

        if (running_sum - k) in hashmap:
            count += hashmap[running_sum - k]

        if running_sum not in hashmap:
            hashmap[running_sum] = 1
        else:
            hashmap[running_sum] += 1

    return count


