"""
Time Complexity: 0(n)
Space Complexity: 0(n)
Approach: Running Sum Approach
    1. Maintain a map to (x) i.e. (rSum : frequency)
    2. Maintain rSum at every index (z)
    3. We are provided sum value to achieve i.e. k (y)
    4. We need to find how many times we get (x) i.e. (z-y) 
"""
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        
        # by default add sum 0 with frequency as 1
        runMap = {0:1}
        rSum = 0

        # maintain the count 
        count = 0

        # we are maintaining how many times we are seeing (x)
        for i in range(0,len(nums)):
            rSum += nums[i]

            if (rSum-k) in runMap:
                # checking if we have (z)-(y) 
                # where (z) is rSum and (y) is k
                count += runMap[rSum-k]
            
            # update the rSum frequency i.e. (x)
            if rSum in runMap:
                runMap[rSum] = runMap[rSum]+1
            else:
                runMap[rSum] = 1
        # end of for loop

        return count