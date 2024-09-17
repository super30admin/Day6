# Time Complexity :
# O(N)  - Length of the arry

# Space Complexity :
# O(1) - There is no auxillary space being allocated

# Did this code successfully run on Leetcode :
#Yes

#To find number of subarrays that sum to k, keep a running sum from the first element to each of the next element in the list of numbers.
# Each time a (running sum - k) appears in the in the list of running sums already found, it means that subarray from the previous point to now sums to k and we increment our count by how many times that runnning sum was found.

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        curr_sum = 0
        start_point = 0
        end_point = 0
        if len(nums) == 1:
            if nums[0] == k:
                return 1
            else :
                return 0
        count = 0
        map1 = {0:1}
        result = 0
        rsum = 0
        for i,elem in enumerate(nums):
            rsum += elem
            if rsum - k in map1:
                result += map1[rsum-k]
            if rsum not in map1:
                map1[rsum] = 1
            else :
                map1[rsum] += 1

        return result
