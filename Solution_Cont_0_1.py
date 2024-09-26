"""
Time complexity O(n)
Space Complexity O(n)

if encountered 1 in array add +1 else -1 

if the rsum is already in d, this means that we encountered a subarray with equal 0 and 1 so we need to update maxlength (current index-d[rsum]index)

else add rsum as key and its index as value
"""


class Solution_Cont_0_1:
    def findMaxLength(self, nums: List[int]) -> int:
        if nums is null or len(nums)==0:
            return 0
        d={0:-1}#{count:index}
        maxlen=0
        rsum=0
        for i in range(len(nums)):
            rsum += 1 if nums[i] == 1 else -1
            if rsum in d:
                maxlen = max(maxlen, i-d[rsum])
            else:
                d[rsum]=i
        return maxlen
        
