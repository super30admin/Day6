# 560. Subarray Sum Equals K
# https://leetcode.com/problems/subarray-sum-equals-k/

# Time Complexiety: O(n)
# Space Complexiety: O(n)

class Solution:
    def subarraySum(self, nums, k) -> int:
        temp_dict = {0:1}
        sum_so_far = 0
        count = 0

        for i in nums:
            sum_so_far += i
            if sum_so_far-k in temp_dict:
                count += temp_dict[sum_so_far-k]            
            
            if sum_so_far not in temp_dict:
                temp_dict[sum_so_far] = 1
            else:
                temp_dict[sum_so_far] += 1
        
        return count

obj = Solution()
print(obj.subarraySum([1,1,1],2))
print(obj.subarraySum([1,2,3],3))
print(obj.subarraySum([1,-1,0],0))
