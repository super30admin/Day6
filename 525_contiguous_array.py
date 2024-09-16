#TC: O(n)
#SC: O(n)

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        r_dict = {0:-1}
        max_length = 0
        rSum = 0
        
        for i in range(len(nums)):
            if nums[i] == 0:
                rSum -= 1
            else:
                rSum += 1
            if rSum in r_dict:
                max_length = max(max_length, i - r_dict.get(rSum))
            else:
                r_dict[rSum] = i
                
        return max_length
