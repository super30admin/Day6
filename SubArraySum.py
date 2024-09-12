# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        count = 0
        dict = {}
        sum = 0
        # Iterate through the numbers in nums
        for num in nums:
            # Add num to the sum
            sum += num
            # If the sum matches the k we want, increment count
            if sum == k:
                count += 1
            # If the difference between sum and k exists, meaning we can make the desired k, add that to count
            if sum - k in dict:
                count += dict[sum - k]
            # If the sum is in the dict, increment it
            if sum in dict:
                dict[sum] += 1
            # Else we make a new entry in the dict with a value of 1
            else:
                dict[sum] = 1
        return count
