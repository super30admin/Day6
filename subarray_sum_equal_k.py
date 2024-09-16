#

# // Time Complexity : # we will have O(n)
# // Space Complexity :O(n)
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : no

class Solution:
    def subarraySum(self, nums, k: int) -> int:
        #intially prefix su  array will have commulative sum as 0 and frequency as 1
        prefixSum={0:1}
        sums=0
        #count of subarray
        count=0

        for i in nums:
            sums+=i

            if sums in prefixSum:
                prefixSum[sums]+=1
            
            else:
                prefixSum[sums]=1
            
            if sums-k in prefixSum:

                count+= prefixSum[sums-k]
        return count 
        

        


