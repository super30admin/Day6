'''

Solution 1:
Time Complexity : O(n^2)

Space Complexity : O(1)

Did this code successfully run on Leetcode : No (Time limit)

Explanation: Brute force approach to find count of 1's and 0's  of the subarrays for every start, end values of the subarray
and then check if count(0) == count(1) if yes then set count of longest subarray as maxCount = max(maxCount, end-start+1)

Solution 2:

Time Complexity : O(n)

Space Complexity : O(n)

Did this code successfully run on Leetcode (findOptimisedMaxLength) : Yes

Explanation: Use the running sum pattern to find if the running sum of the sub array has already been visited, if yes
then check max(rsum, index - (index of previous rsum)) to count else add the current rsum with index as key


'''
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        count = 0

        for i in range(0, len(nums)):
            zero = 0
            one = 0
            for j in range(i, len(nums)):

                if nums[j] == 0:
                    zero = zero + 1

                if nums[j] == 1:
                    one = one + 1

                if zero == one:
                    count = max(count, j - i + 1)

        return count

    def findOptimisedMaxLength(self, nums: List[int]) -> int:
        if len(nums) == 0 or nums == None:
            return 0

        count = 0
        rsum = 0
        dict1 = {0: -1}
        for i in range(0, len(nums)):
            if nums[i] == 0:
                rsum = rsum + (-1)
            else:
                rsum = rsum + 1

            if rsum not in dict1.keys():
                dict1[rsum] = i
            else:
                count = max(count, i - dict1[rsum])

        return count