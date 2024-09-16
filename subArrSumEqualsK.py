# // Time Complexity : O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // Your code here along with comments explaining your approach

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        
        # To keep track of cumulative sum-> total ; to keep track of total number of subarrays->cnt
        total = 0
        cnt = 0
        
        # create a hash map as we need to track the sum and #of subarrays as key, value pairs
        hMap = {}
        
        # assigning our first case where empty array of sum 0 will be of length 1
        hMap[0] = 1

        # start traversing through the array
        for i in range(len(nums)):
            # add the cumulative sum
            total += nums[i]
            # maintain the compliment 
            compli = total - k

            # if this compliment is present in our hashmap, add the subsequent count from the hashmap
            if compli in hMap:
                cnt += hMap.get(compli)
                
            # if sum is not added to hashmap, add it and assign the value as 1 
            # if already added, increase the value of sum by 1, meaning another subarray that sums upto the key was found
            if total not in hMap:
                hMap[total] = 1
            else:
                hMap[total] = hMap.get(total)+1
        
        # return the tracked number of subarrays
        return cnt
        
        