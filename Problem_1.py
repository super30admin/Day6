class Solution:
	def findMaxLength(self, nums: List[int]) -> int:
		if not nums:
			return 0
		hashmap = {}
		rsum, maxsum = 0,0
		hashmap[0] = -1
		for i in range(len(nums)):
			if nums[i] == 0:
				rsum-=1
			else:
				rsum+=1
			if rsum in hashmap:
				curr = i - hashmap[rsum]
				maxsum = max(maxsum, curr)
			else:
				hashmap[rsum] = i    
		return maxsum

#i am confused if retrieving the key/value from the hashmap is O(1) or O(n)

#time_complexity - O(n) if retrieving is O(1) else its O(n^2)
#space_complexity - O(n)
#all test cases passed