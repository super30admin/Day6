class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        s = 0 ; sumdict={}; sumdict[0] = -1; i = -1 ; longest_seq =0 ;
        for t in nums:
            if t==0:
                s+=-1 
            else:
                s+=1
            i += 1
            if s not in sumdict:
                sumdict[s] = i
            else:
                longest_seq = max(longest_seq, i - sumdict[s] )
        return longest_seq