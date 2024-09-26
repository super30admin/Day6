# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

class Solution:
  def subarraySum(self, nums: List[int], k: int) -> int:
    # store the count when a cumulative sum is reached in dict
    cum_sum = dict()
    sum_val = 0
    counter = 0
    # initalize dict with sum value 0 occuring once
    # so that first time we encounter k as cum value 
    # we can identify as valid subarray
    cum_sum[0] = 1
    for i in nums:
      # calculate cumulative sum
      sum_val += i
      
      # check if the complementary value exists
      if (sum_val - k) in cum_sum.keys():
        # add to counter if it does
        counter += cum_sum[sum_val - k]
      
      # add count to dictionary 
      if sum_val in cum_sum.keys():
        cum_sum[sum_val] += 1
      else:
        cum_sum[sum_val] = 1
    return counter