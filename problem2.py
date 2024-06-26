'''
## Problem2 (https://leetcode.com/problems/contiguous-array/)

Time Complexity : O(n)
Space Complexity : O(n)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

'''

class Solution:
  def findMaxLength(self, nums):
    # create an array of zeroOneCounts for every 1 add 1, for every 0 subtract 1
    zeroOneCountsArray = []
    zeroOneCounts = 0
    for num in nums:
      if num == 1:
        zeroOneCounts += 1
      else:
        zeroOneCounts -= 1
      zeroOneCountsArray.append(zeroOneCounts)

    # a hashmap to maintain the indices of parities
    zeroOneCountsIndex = { 0: -1 }
    maxSubAraySize = 0
    for idx, num in enumerate(zeroOneCountsArray):
      # if this zeroOneCounts value has occured at an index before
      # the subarray from that index to current index sums zero
      # and the distance from that index is bigger than current value of maxSubAraySize
      # then update maxSubAraySize with the difference in the indices
      if num in zeroOneCountsIndex:
        maxSubAraySize = max(maxSubAraySize, idx - zeroOneCountsIndex[num])
      else:
        zeroOneCountsIndex[num] = idx
    return maxSubAraySize

s = Solution()
nums1 = [0,1,0]
print('nums = {}\noutput = {}'.format(nums1, s.findMaxLength(nums1)))
print('------------------------------')
nums2 = [0,1,1,1,0,1,0,0,1,1]
print('nums = {}\noutput = {}'.format(nums2, s.findMaxLength(nums2)))
