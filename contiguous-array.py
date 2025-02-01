# The algorithm uses a hashmap to track the first occurrence of cumulative count (+1 for 0, -1 for 1), 
# helping identify subarrays with equal 0s and 1s. If the same count reoccurs, the difference in indices gives the 
# longest balanced subarray.
# Time Complexity: O(N) → Single pass through nums.
# Space Complexity: O(N) → Stores prefix sums in the hashmap.
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        count = {0 : -1}
        ans = 0 
        max_length = 0
        for i, num in enumerate(nums):
            if num == 0:
                ans += 1
            else:
                ans -= 1
            if ans in count:
                max_length = max(max_length, i - count[ans])
            else:
                count[ans] = i
        return max_length