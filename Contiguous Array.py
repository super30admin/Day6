# time complexity is o(n), where 'n' is the size of the input
# space complexity is o(n), where 'n' is the size of the input
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        d = {0 : -1}
        resum = 0
        maxarray = 0
        for i in range(len(nums)):
            if(nums[i] == 0):
                resum -= 1
            else:
                resum += 1
            if resum not in d:
                d[resum] = i
            else:
                maxarray = max(maxarray, i-d[resum])
        return maxarray
            
        