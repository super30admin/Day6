class Solution:
    def findMaxLength(self, nums: List[int]) -> int:

        hm = {0:-1}
        r_s = 0
        mx_len = 0
        
        for i in range(0, len(nums)):
            if nums[i] == 0:
                r_s -= 1
            else:
                r_s += 1
                
            
            if r_s not in hm:
                hm[r_s] = i
            else:
                mx_len = max(mx_len, i - hm[r_s])
                
        #print(hm)
        return mx_len
        