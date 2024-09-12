#Time complexity: O(n)
#Space complexity: O(n)

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        d = {0: -1}
        ans = 0
        cumsum = 0
        
        for i in range(len(nums)):
            cumsum += 1 if nums[i] == 1 else -1
            if cumsum in d:
                ans = max(ans, i - d[cumsum])
            else:
                d[cumsum] = i
                
        return ans
