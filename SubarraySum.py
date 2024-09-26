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
        -> Keep running sum -> count in a map.
        -> Add current num to the running sum.
        -> Find the complement (running_sum - k).
        -> If the complement is in the map then increase the count by the
            count of complements from the map.
        -> Increment running sum's count inside the map.
'''
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        map = collections.defaultdict(int)
        map[0] = 1
        count = 0
        running_sum = 0

        for num in nums:
            running_sum += num
            complement = running_sum - k

            if complement in map:
                count += map[complement]

            map[running_sum] += 1

        return count
