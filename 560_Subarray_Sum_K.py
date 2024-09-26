# Leetcode problem link : https://leetcode.com/problems/subarray-sum-equals-k/
# Time Complexity : O(n) 
#  Space Complexity : O(n)
#  Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
'''
        Basic approach : O(n2) => check for all subarrays from each starting point and check the sum, restart with sum 0 from next index and keep repeatin

        Optimized approach: The main idea of this problem is to create a hashmap with sum encountered and its count or number of subarrays. As soon as we reach a complement 0 that means the sum between current index and some index encountered earlier is the desired sum hence we get the count of subarrays stored in hashmap and add to the global count.
        1. Initialize sum and count to 0
        2. Create a dictionary or hashmap with sum as 0 and value 1 as [] is a valid subarray with sum 0. This has been added to keep track of condition when sum from 0th index to current index is k or index where cumulative sum of elements becomes zero.
        3. Iterate through the array
        4. Add current element to sum
        5. Compute the complement from desired sum and check if its present in the hash map
        6. Add the number of subarrays for the complement sum if its present in the hasmap
        7. Add count 1 for current sum to hash map
        8. Return count
'''
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        # 1
        total_sum = 0
        count = 0
        # 2
        sum_map = { 0: 1 }
        
        # 3
        for num in nums:
            # 4
            total_sum += num
            # 5
            comp = total_sum - k
            if comp in sum_map:
                # 6
                count += sum_map[comp]
            # 7
            if total_sum in sum_map:
                sum_map[total_sum] +=1
            else:
                sum_map[total_sum] = 1
        # 8
        return count
            
            
        