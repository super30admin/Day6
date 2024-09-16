
"""
Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.

Time = O(N); N = number of elements in given array
Space = O(N)

Successfully executed in leetcode

Approach(Hashmap) ---
1. If the cumulative sum(sum upto i index) upto two indices is same, sum between this two indices is zero
2. If the sum[i]-sum[j] = k, the sum of elements lying between this indoces is k
3. Traverse theough array, add entry of cumulative new sum(key) and if same occurs again update the count(value).
4. Determing how many times sum-k = 0 has ocuured, increment the count each time and return count at the end.

"""

class SubArray:
    def subarraySum(self, nums: List[int], k: int) -> int:
        count = 0
        sums = 0
        d = dict()
        d[0] = 1
        
        for i in range(len(nums)):
            sums += nums[i]
            count += d.get(sums-k,0)
            print("count", count)
            d[sums] = d.get(sums,0) + 1
            print("d", d)
        return(count)