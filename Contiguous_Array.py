#// Time Complexity :O(n) #n is the length of string
#// Space Complexity :O(n)
#// Did this code successfully run on Leetcode :yes
#// Any problem you faced while coding this :yes learnt the optimal solution from sir.

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        if nums==[]:
            return 0
        hashmap={0:-1}
        rsum=0
        length=0
        max_length=0
        for i in range(len(nums)):
            if nums[i]==0:
                rsum=rsum-1
            else:
                rsum=rsum+1
                
            if rsum not in hashmap:
                hashmap[rsum]=i
            else:
                length=i-hashmap[rsum]
            if max_length< length:
                max_length=length
        return max_length