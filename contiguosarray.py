from collections import defaultdict
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        '''
        TC: O(n)
        SC: O(n)
        Travers through the array and store current sum when diff if the same currentsum present befor get the length and find max of this and return.
        '''
        
        d = defaultdict(int)
        d[0] = -1
        running_sum = 0
        ans = 0
        for i in range(len(nums)):
            running_sum += -1 if nums[i] == 0 else nums[i]
            if running_sum in d: 
                ans = max(ans,i-d[running_sum])
            else:
                d[running_sum] = i 
        return ans