#Time Complexity: O(n) n -> length of nums
#Space Complexity: O(n) the hashmap can contain distinct running sum
#Did your code run on leetcode : yes

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        runningSum_dict = {0 : -1}
        
        max_length = 0
        rsum = 0
        for i in range(len(nums)):
            if nums[i] == 0:
                rsum -= 1
            elif nums[i] == 1:
                rsum += 1
            
            if rsum not in runningSum_dict.keys():
                runningSum_dict[rsum] = i
            else:
                max_length = max(max_length, i - runningSum_dict[rsum] )
        return max_length
                
        
        
        
