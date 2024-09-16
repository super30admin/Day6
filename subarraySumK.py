# // Time Complexity : O(n) 
# // Space Complexity : O(n)  
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : understanding running sum 
# used in finding possible subarrays wit sum k 


# // Your code here along with comments explaining your approach
from collections import defaultdict 

class Solution:
    def subarraySum(self, nums, k: int) -> int:
        # edge case when nums is empty
        if not nums: return 0
        
        runningSum = 0
        count = 0
        hashmap = defaultdict(lambda: 0)
        # for cases when diff = 0 is found
        hashmap[0] = 1
        
        for i in range(len(nums)):
            runningSum += nums[i]
            if runningSum - k in hashmap:
                count += hashmap[runningSum-k]
            hashmap[runningSum] += 1
        
        return count
if __name__=="__main__":
    obj = Solution()
    count = obj.subarraySum([2,5,7,8,9],7)
    print(count)