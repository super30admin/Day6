'''
    Time Complexity:
        O(n)

    Space Complexity:
        O(n)

    Did this code successfully run on LeetCode?:
        Yes

    Problems faced while coding this:
        None

    Approach:
        -> Running sum approach.
        -> Keep running sum -> index in a map.
        -> Add 1 to the running sum if current number is 1, else subtract 1.
        -> If the current running sum is in the map then that means the numbers
            in the subarray from the index of the running sum (from map) to the
            current index are balanced.
        -> The diff of these indices is the length of a balanced subarray.
'''
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        running_sum = 0
        map = {0: -1}
        max_len = 0

        for idx, num in enumerate(nums):
            running_sum += 1 if num == 1 else -1
            if running_sum in map:
                last_idx = map[running_sum]
                max_len = max(max_len, idx - last_idx)
            else:
                map[running_sum] = idx

        return max_len
