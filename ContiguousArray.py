# Time Complexity : O(n)
# Space Complexity : O(n) 
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no
class Solution:
  def findMaxLength(self, nums: List[int]) -> int:
    # Store in dictionary the first index when 
    # a cumulative sum is reached 
    # if 0 is taken as -1,    
      if nums[i] == 0:
        sum_val += -1
      else:
        sum_val += 1
      
      # The next time the same cumulative sum is reached implies 
      # the number of 0 = number of 1
      if sum_val in hmap.keys():
        # compare with prev max length to get new max length
        max_length = max(max_length, i - hmap[sum_val])
      else:
        hmap[sum_val] = i
    
    return max_length
            