'''
## Problem1 (https://leetcode.com/problems/subarray-sum-equals-k/)

Time Complexity : O(n)
Space Complexity : O(n)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

'''

class Solution:
  def subarraySum(self, nums, k):
    # create an array of running sums
    runningSum = 0
    runningSumArray = []
    for num in nums:
      runningSum += num
      runningSumArray.append(runningSum)

    # a hashmap to maintain occurences of running sums
    runningSumsFound = { 0: 1 }
    subArrayCount = 0

    for rs in runningSumArray:
      difference = rs - k

      # if this difference (rs - k) has already occured before as a running sum,
      # the subarray from that index to this index should have a sum of k
      # we update the subArrayCount with the number of times this difference value has occured before as a running sum
      if difference in runningSumsFound:
        subArrayCount += runningSumsFound[difference]

      # update the running sum count
      if rs in runningSumsFound:
        runningSumsFound[rs] += 1
      else:
        runningSumsFound[rs] = 1
    return subArrayCount

s = Solution()
nums1 = [1,1,1,2,3,4,1]
k1 = 5
print('nums = {}\nk = {}\noutput = {}'.format(nums1, k1, s.subarraySum(nums1, k1)))
print('------------------------------')
nums2 = [1,2,-1,0,-3,2,1,4,-2]
k2 = 2
print('nums = {}\nk = {}\noutput = {}'.format(nums2, k2, s.subarraySum(nums2, k2)))
print('------------------------------')
nums3 = [1,2,3]
k3 = 3
print('nums = {}\nk = {}\noutput = {}'.format(nums3, k3, s.subarraySum(nums3, k3)))
