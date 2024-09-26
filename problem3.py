#contiguous binary subarray
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        nummap=dict()
        maxlen=0
        zero=0
        for i, v in enumerate(nums):
            if v==0:
                zero+=1
            else:
                zero-=1
            if zero==0:
                maxlen=i+1
            if zero in nummap:
                if maxlen < (i - nummap[zero]):
                    maxlen=i-nummap[zero]
            else:
                nummap[zero]=i
        return maxlen