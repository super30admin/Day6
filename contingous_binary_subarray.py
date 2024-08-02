#tme complexity - O(n)
# space complexity - O(n)
#tested on leetcode
# keeping track of the running_sum and INDEX for each number
# check if running_sum  exists then its earliest index in the hashmap
# if it exists then subtract current index - earliest index to get the max length 
# else just add the running sum and index to the hashmap and finally return the max length
# for running sum increment for 1 and decrement for 0
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        hmap = {0 : -1} # dummy integer entry for starting balanced array
        running_sum = 0
        result = 0
        if not nums:
            return 0
        for i, num in enumerate(nums):
            if num == 0:
                running_sum -= 1
            else:
                running_sum += 1
            if running_sum in hmap:
                result = max(result, i - hmap[running_sum])
            else:
                hmap[running_sum] = i
        return result