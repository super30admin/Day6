# Approach 
# Brute Force - form all the possible subarrays nested for loops basicaly ap n*(n-1)*(n-2).....1=O(n^2)
# Check over all 0's and 1's in a subarray and return a subarray if total sum is 0 then return 
# In order to remove nested operation techniques 
# various techniques : BS(sorted), Hashing(always prefer hashing when we have to search because search time o(1)), Sliding window, DP(You can see by question only when to use DP)
# Tc and SC : O(n)
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        if len(nums)==0:
            return 0
        
        hash_map={}
        rSum=0
        max_val=0
        hash_map[0]=-1
        #{0:-1}
        # initially rSum is 0 
        # when 0 is there then reduce rSum by 1
        # when 1 is there then increase rSum by 1
        # if rSum is already there then current_index-first occurence of rSum
        # if rSum is not there then add rSum as key and index as value in map 
        # return max_val basically max_length of subarray

        for i in range(len(nums)):
            if nums[i]==0:
                rSum-=1
            else:
                rSum+=1

            if rSum in hash_map:
                max_val=max(max_val,i-hash_map[rSum])
            else:
                hash_map[rSum]=i
        return max_val
        