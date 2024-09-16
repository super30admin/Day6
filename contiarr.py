# Time Complexity : O(N) due to the single pass for loop
# Space Complexity : O(N) for the dictionary 
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : No



class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0
        count = 0
        mydict = {}
        res = 0
        mydict[0] = -1
        for i in range(len(nums)):
            if nums[i] == 0:
                count -= 1
            else:
                count += 1
            if count in mydict:
                res = max(res, (i - mydict[count]))
            else:
                mydict[count] = i
        return res
            
        
        