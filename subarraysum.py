from collections import defaultdict
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        '''
        Time complexity : O(n)
        Space complexity : O(n)
        storing sum at each position and at each position check if the value equal to current_sum - k is present then add the value of d[current_sum - k] in to the answer 
        '''
        d = defaultdict(int)
        d[0] = 1
        ans = 0
        running_sum = 0
        for i in range(len(nums)):
            running_sum += nums[i] 
            if (running_sum - k) in d: 
                ans += d[running_sum - k] 
            d[running_sum] += 1 # storing current sum
        return ans
                
                
        