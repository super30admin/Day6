# TC: O(n)
# SC: O(n)
# LeetCode: Y(https://leetcode.com/problems/subarray-sum-equals-k/)
# Approach: Let there be a prefix_sum list where prefix[i] is the sum of all values up till the ith index
#           So prefix_sum[i] - prefix_sum[j] (i > j) is the sum of the subarray of list values from i + 1 to j
#           The idea behind this approach is to calculate cumulative running sum and store it into a dictionary 
#               where key is the cumulative running sum 
#               value is the number of times the cumulative running sum seen in the array 
#           Let us say there is subarray from [0,i] whose sum is x and there exists a subarray in between whose sum is k then check for the occurences of (x - k) (complement). These number of occurences adds to the number of subarrays whose sums equal k.


class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        
        # Dictionary to store the running sum occurences 
        # (0,1) key-value pair inserted to handle the case of sub-array from beginning to current_index whose sum is k
        running_sum_counts = {0:1}
        
        # initialize running sum
        running_sum = 0
        
        # initalize ans
        ans = 0
        
        # iterate through the nums list
        for num in nums:
            
            # update running sum
            running_sum += num
            
            # calculate complement
            complement = running_sum - k
            
            # if there is an entry of complement in the dictionary then there is a sub-array whose sum equals k
            if complement in running_sum_counts:
                # update ans
                ans += running_sum_counts[complement]
                
            # insert a new key-value pair for the running sum or increment an exisiting pair if one exists
            running_sum_counts[running_sum] = running_sum_counts.get(running_sum, 0) + 1
            
        # return ans    
        return ans
        
