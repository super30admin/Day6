class Solution:
    # leetcode URL : https://leetcode.com/problems/contiguous-array/
    # Problem : 525. Contiguous Array
    # Time Complexity : O(n)
    # Space Complexity : O(n) - as in worst case the disctionary can grow proportional to the array size if everyting is either 0 or 1
    def findMaxLength(self, nums: List[int]) -> int:
        len_dict = dict()
        len_dict[0]= -1
        max_len = 0
        prefix_sum = 0
        
        for i in range(0,len(nums)):
            curr_num = nums[i]
            if curr_num==0:
                curr_num = -1 
                
            prefix_sum = prefix_sum + curr_num
            
            if prefix_sum in len_dict.keys():
                max_len = max(max_len,(i - len_dict[prefix_sum]))
            else:
                len_dict[prefix_sum] = i
        return max_len