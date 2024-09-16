# APPROACH 1: (MY APPROACH) - SLIDING WINDOW / TWO POINTER 
# Time Complexity : O(n) - n is the length of nums
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : No
# Any problem you faced while coding this : This technique wont work as we have negative elments in the list. So by increasing start and end pointer doesn't gurantee that sum
#                                           will increase
#
# Your code here along with comments explaining your approach
# 1. if k is 0, checked for elements that are 0 in array and return it's count
# 2. Else, go through each element of the array and keep track of start index and current sum. 
# 3. If current sum < k   -> add the current element to it and increement end index
#    If current sum == k  -> increement the count of subarrays and start index, subtract the start index's value from current sum
#    If current sum > k   -> increement the start and end index, subtract the start index's value from current sum


class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        
        if not nums:
            return 0
        
        curr_sum, start_ind, count_sub_arr, ind = 0, 0, 0, 0
        
        if k == 0:
            for num in nums:
                if num == 0:
                    count_sub_arr += 1       
            return count_sub_arr
        
        while ind < len(nums):
            
            if curr_sum < k:
                curr_sum += nums[ind]
                ind += 1
                
            elif curr_sum == k and k != 0:
                count_sub_arr += 1
                curr_sum -= nums[start_ind]
                start_ind += 1
                
            elif curr_sum > k:
                curr_sum -= nums[start_ind]
                start_ind += 1
                ind += 1
                
        if curr_sum == k and ind == len(nums):
            count_sub_arr += 1
            
        return count_sub_arr
        
        
        
# APPROACH 2: BRUTE FORCE SOLUTION
# Time Complexity : O(n^2) - n is the length of nums
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : No (TIME LIMIT EXCEEDED)
# Any problem you faced while coding this : None
#
#
# Your code here along with comments explaining your approach
# 1. Vary start position of subarray from 0 till end of list
# 2. For each start pos -> consider sum till end of list
# 3. Each time you add element, check if it's sum is equal to k or not. 


class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        
        if not nums:
            return 0
        
        count_sub_arr = 0
        for start in range(0, len(nums)):
            curr_sum = 0
            
            for ind in range(start, len(nums)):
                curr_sum += nums[ind]
                if curr_sum == k:
                    count_sub_arr += 1
                    
        return count_sub_arr
        
        
        
        
# APPROACH  3: OPTIMAL SOLUTION (HASHMAP and CUMULATIVE SUM)
# Time Complexity : O(n) - n is the length of nums
# Space Complexity : O(n) - hashmap length
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None
#
#
# Your code here along with comments explaining your approach
# 1. Have a hashmap to store cumulative sum and their count
# 2. For each element of list, cumulative sum compute. -> x. check if x - k exist in hashmap (if x - k occurred in past or not, If so, then the sum of elements between 
#    two indices is k. Update count of subarrays accordingly.
# 3. Store this cumulative sum along with increemented count in hashmap
 
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        
        if not nums:
            return 0
        
        hashmap, cum_sum, count_sub_arr = {0: 1}, 0, 0
        for ind in range(len(nums)):
            cum_sum += nums[ind]
            
            if cum_sum - k in hashmap:
                count_sub_arr += hashmap[cum_sum - k]
                
            if cum_sum in hashmap:
                hashmap[cum_sum] += 1
            else:
                hashmap[cum_sum] = 1
                
        return count_sub_arr
        
