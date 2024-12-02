'''
Sol 1:

Time Complexity : O(n^2)

Space Complexity : O(1)

Did this code successfully run on Leetcode : No (Time limit on 68th string)

Explanation: Brute force approach to find sum of the subarrays for every start, end values of the subarray and
and hence find every sum for every subsequence and check if equal to k, if yes increment count.

Sol 2:

Time Complexity : O(n)

Space Complexity : O(n)

Did this code successfully run on Leetcode (subarraySumOptimised): Yes
Use running sum pattern to calculate the running sum for subarray. First find the compliment then check if compliment
in the dictionary if yes, the rsum has been seen and add the value of the dictionary[complement] into the count
else check if rsum has been seen or not, if yes then increment the value in the dictionary of that rsum else set it to 1
'''

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        count = 0
        for i in range(0, len(nums)):
            sum1 = 0
            for j in range(i, len(nums)):
                sum1 = sum1 + nums[j]
                if sum1 == k:
                    count = count + 1
        return count

    def subarraySumOptimised(self, nums: List[int], k: int) -> int:
        if len(nums) == 0 or nums == None:
            return 0

        count = 0
        rsum = 0
        dict1 = {0: 1}
        for i in range(0, len(nums)):
            rsum = rsum + nums[i]
            comp = rsum - k

            if comp in dict1.keys():
                count = count + dict1[comp]
            if rsum not in dict1.keys():
                dict1[rsum] = 1
            else:
                dict1[rsum] = dict1[rsum] + 1

        return count
