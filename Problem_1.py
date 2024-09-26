# Time Complexity : O(n^2)
# Space Complexity : constant

class Problem_1:
	def findContinuousArray(self, arr, k):
		count = 0
		for i in range(len(arr)):
			temp_sum = arr[i]
			if temp_sum == k:
				count += 1
				continue
			for j in range(i + 1, len(arr)):
				temp_sum += arr[j]
				if temp_sum == k:
					count += 1
					break
				elif temp_sum > k:
					break
		return count

if __name__ == "__main__":
	nums = [23, 2, 4, 6, 7, 3, 3]
	k = 6
	p1 = Problem_1()
	print(p1.findContinuousArray(nums, k))