# 525. Contiguous Array
# https://leetcode.com/problems/contiguous-array/

# Time Complexiety: O(n)
# Space Complexiety: O(n)

class Solution:
    def findMaxLength(self, nums) -> int:
        temp_dict = {0:-1}
        sum_so_far = 0
        max_length = 0

        for idx, i in enumerate(nums):
            if i == 0:
                sum_so_far += -1
            else:
                sum_so_far += 1
            
            if sum_so_far not in temp_dict:
                temp_dict[sum_so_far] = idx
            else:
                max_length = max(max_length,idx - temp_dict[sum_so_far])
        
        return max_length

obj = Solution()
print(obj.findMaxLength([0,1]))
print(obj.findMaxLength([0,1,0]))
print(obj.findMaxLength([0,1,0,1]))
print(obj.findMaxLength([0,0,1,0,0,0,1,1]))
