#Time complexity: O(n)
# Space complexity: O(n)
# Worked on leetcode
# The algorithm calculates the contiguous sum of numbers in the array, and stores the sum, and sum-targetsum in the Hashmap. If the targetsum already exists, it
# increments the count.



class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:

        Hashmap = {}
        current_sum = 0
        count = 0
        Hashmap[0] = 1

        for i in range(len(nums)):
            current_sum += nums[i]

            if (current_sum - k) in Hashmap.keys():
                count += Hashmap[current_sum - k]

            if current_sum in Hashmap.keys():
                new_count = Hashmap[current_sum]
            else:
                Hashmap[current_sum] = 1

        return count

