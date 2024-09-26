# // Time Complexity : O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // Your code here along with comments explaining your approach
	# Maintain a Hash map that collects the running sum
	# if a runing sum has already occured in the past then it means that
	# there exists a balanced array from the current index and the idex that is stored 
	# in the hash map
	
	# NOTE:
	# Add 0 at the start of the array to consider the edge cases
	# +1 if for a 1
	# -1 is for a 0

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        if not nums:
            return 0
        Map = {}
        rSum = 0
        Map[0] = -1
        Max = 0
        length = 0
        for i in range(len(nums)):
            if nums[i] == 0:
                rSum += -1
            else:
                rSum += 1
            if rSum in Map:
                length = i - Map[rSum]
                if length >= Max:
                    Max = length
            else:
                Map[rSum] = i
        return Max
        