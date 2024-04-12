# // Time Complexity : O(n)
# // Space Complexity : O(1) 
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : no


# // Your code here along with comments explaining your approach

# Intution: 
# similar to 

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        hmap = {0: 1}
        
        count = 0
        rsum = 0

        for i in range(len(nums)):

            rsum += nums[i]
            comp = rsum - k

            if comp in hmap:
                count  += hmap.get(comp)
            
            if rsum not in hmap:
                hmap[rsum] = 1
            else:
                hmap[rsum] = hmap[rsum] + 1
        return count