"""
Hashing-2
Problem1 (https://leetcode.com/problems/subarray-sum-equals-k/)
Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.
Example 1:
Input:nums = [1,1,1], k = 2
Output: 2
Note:
The length of the array is in range [1, 20,000]. The range of numbers in the array is [-1000, 1000] and the range of the integer k is [-1e7, 1e7].
Executed in Leetcode: 3 test cases. Got one 'Time limit Exceeded'.
Time complexity: O(N^2)
Space complexity: O(1)
Challenges: One test case is giving 'Time limit exceeded'. Others are executing fine.
Comments: A variable count is used to store the number of  subarrays. 
Whenever a  new start index is chosen, the  sum is reset to zero. Thereafter, we find the sum of all values from that index till the  
end of the array.When sum is equal to the prescribed value, count is updated.
"""

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        if not nums:
          return -1
        count = 0
        for i in range(len(nums)):
            sum = 0
            for j in range(i, len(nums)):
                sum += nums[j]
                if sum == k:
                    count += 1
        return count
        
