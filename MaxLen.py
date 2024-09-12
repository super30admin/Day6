# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        # Hashmap to store the count at each num
        dict = {}
        # Final result
        maxLen = 0
        # Counting the number of 0's and 1's. We want the sum to remain 0 as that means equal 0 and 1
        count = 0
        dict[0] = -1
        # Iterate through the nums
        for i in range(len(nums)):
            # 0 means we decrement count
            if nums[i] == 0:
                count -= 1
            # 1 means we increment count
            else:
                count += 1
            # Now we check if the count exists in the dict, if the count is 0, equal 0 and 1 so now we get the max length
            if count in dict:
                maxLen = max(maxLen, i - dict[count])
            else:
                dict[count] = i
        return maxLen
