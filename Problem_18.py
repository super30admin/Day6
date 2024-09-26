# Time Complexity : O(n) where n is the length of nums
# Space Complexity : O(n) for the hashmap which can have a max of n different keys (can happen when all elements are 0 or all are 1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        h = {} # Initialize a hashmap
        h[0] = -1 # Put value for key 0 as -1 meaning the initial running sum is 0 at index -1 i.e before we start with index 0
        rSum = 0 # Initialize running sum
        ans = 0 # Initialize max length that we have to return
        
        for i in range(len(nums)):
            if nums[i] == 0:
                rSum -= 1 # If the current element is 0, reduce the running sum by 1
            else:
                rSum += 1 # Otherwise, the element is 1 and increase the running sum by 1
            if rSum in h.keys(): # If we fin running sum in keys of the hasmap
                ans = max(ans, i-h[rSum]) # Compare our answer i.e current max length of the contiguous subarry and compare it with i-h[rSum]. i is the current index calculated from the 0th index, h[rSum] is the first index when rSum was the running sum at that point. So, at h[rSum] index and current index both have a running sum = rSum, so the sub array in between these 2 indices must be a balanced array and its personal running sum must be 0. So we compare the length of that sub array (which is given by index i - h[rSum] with current ans and store the max between these two as our ans
            else:
                h[rSum] = i # If current rSum doesn't exist in keys, then make one and store current index as value
        return ans