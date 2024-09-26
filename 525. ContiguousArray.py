# Time complexity= 0(N)
# Space Complexity = 0(N) // as the array size is unknown

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
    ## running sum concepts 
    # When the problem is solving with two loops then use hash map or 2 pointer or sliding window or binary search
    # rsum:0 
    # [1,2,3,4,5]
    # runningsum = [1,3,6,10,15]
    # we need sum of A = : [2,3,4] 
    # from runningsum at the the last index - from sum one index before the starting index of A
    # 10 -1 = 9
        
    ## [0,1] if we start the sum = 0 and if occur 0 then -1 and occur 1 then +1 so 0-1 = -1 and -1+1 =0 so if we have same number of 1 and 0
    ## then the sum will be same
        if len(nums) == 0:
            return 0
        
        len_array = 0 
        rsum = 0
        dict1 = {}
        dict1[0] = -1

        

        for i in range(len(nums)):
            if nums[i] == 1:
                rsum += 1
            else:
                rsum -= 1
            
            if rsum in dict1:
                len_array = max(i - dict1.get(rsum), len_array)
            else:
                dict1[rsum] = i 
        return len_array