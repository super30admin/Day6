class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        
        rsum = 0
        dict = {}
        dict[0] = -1
        max_length = 0
        for i in range(len(nums)):
          if nums[i] == 1:
            rsum += 1
          else:
            rsum -= 1

          if rsum not in dict:
            dict[rsum] = i
          
          max_length = max(max_length, i - dict[rsum])

          
        return max_length
          


          
        