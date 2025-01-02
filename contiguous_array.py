# Time Complexity = O(n)
# Space Complexity = O(1)
# Leetcode = yes
# Approach = Track the running sum of 1s and -1s for 1s and 0s. Use a hashmap to store the first occurrence of each running sum and calculate the length of the subarray whenever the sum repeats. which is max between current max and diff between current index - current sum index in hashmap
class Solution:
    def findMaxLength(self, nums: list[int]) -> int:
        # Map to store the first occurrence of a running sum
        sum_map = {}
        sum_map[0] = -1  # To handle the case when subarray starts from index 0
        
        max_len = 0
        running_sum = 0
        #{key: val = running sum -> index}
        for i in range(len(nums)):
            if nums[i] == 0:
                running_sum -= 1
            else:
                running_sum += 1
            
            if running_sum in sum_map:
                max_len = max(max_len, i - sum_map[running_sum])
            else:
                sum_map[running_sum] = i
        
        return max_len

nums = [0, 1, 0]
solution = Solution()
result = solution.findMaxLength(nums)
print(result)