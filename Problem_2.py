# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : 
# Use a hashmap to store the first index of the running sum in the binary array. Keep incrementing the running sum(zero) by 1 when we encounter a 1 and decrement by 1 when we encounter a zero. If running sum becomes zero then the array of longest length with same number of zeroes and ones is from index 0 till the index where running sum becomes zero

class Problem_2:
	def EqualNumbersCount(self, arr):
		maxLength = 0
		zero = 0
		NumberIndexMap = dict()
		for index, val in enumerate(arr):
			if val == 1:
				zero += 1
			else:
				zero -= 1
			if zero == 0:
				maxLength = index + 1
			if zero in NumberIndexMap:
				if maxLength < index - NumberIndexMap[zero]:
					maxLength = index - NumberIndexMap[zero]
			else:
				NumberIndexMap[zero] = index
		return maxLength

if __name__ == '__main__':
	nums = [1, 1, 1, 1, 0, 1, 0, 1, 0, 0]
	p2 = Problem_2()
	print(p2.EqualNumbersCount(nums))