"""
Approach:

use compliment of running sum to find the sum of sub array. if the sum of sub array is k, increment count.

1) run through the numbers in the given list and store the number of their occurrences in a hashmap
2) check for the compliment of running sum at the same time. if running sum compliment has been found, the 2nd
    sub array has a sum of k
    a)  z = x + y
        running sum = z
        sum of 2nd array = k = y
        compliment of running sum i.e sum of first array = z - y = x
        if x has occurred before, i.e. x is registered in the hashmap. We can increment our count

"""
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        sum_count = {0: 1}
        rsum = 0
        out = 0
        for num in nums:
            rsum += num
            compliment = rsum - k
            if compliment in sum_count:
                out += sum_count[compliment]

            if rsum not in sum_count:
                sum_count[rsum] = 1
            else:
                sum_count[rsum] += 1

        return out


"""
Time Complexity: O(n)
Space Complexity: O(n)
"""