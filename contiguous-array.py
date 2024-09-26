'''
T.C: O(n)
S.C: O(n)

Intuition: 

calculate prefix sum when 0 is encountered -1, else +1. If sum has been encountered before, then it has equal number 
of 0s and 1s inbetween them

'''
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        num_len = len(nums)
        if not num_len:
            return 0
        
        mx_len = 0
        hmap = {
            0 : -1
        }
        prefix_sum = 0
        
        for idx in range(num_len):
            num = nums[idx]
            if num == 0:
                prefix_sum -= 1
            else:
                prefix_sum += 1
            if prefix_sum in hmap:
                mx_len = max(mx_len, idx - hmap[prefix_sum])
            else:
                hmap[prefix_sum] = idx
        
        return mx_len
            
        