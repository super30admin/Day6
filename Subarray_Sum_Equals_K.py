#// Time Complexity :O(n) #n is the length of string
#// Space Complexity :O(n)
#// Did this code successfully run on Leetcode :yes
#// Any problem you faced while coding this :yes learnt the optimal solution from sir.

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        hashmap={0:1}
        count=0
        rsum=0
        for i in nums:
            rsum=rsum+i
            complement=rsum-k
            if complement in hashmap:
                count=count+hashmap[complement]
            if rsum not in hashmap:
                hashmap[rsum]=1
            else:
                hashmap[rsum]=hashmap[rsum]+1
                
        return count
                           