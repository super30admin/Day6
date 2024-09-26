class Problem_1:
	def findContinuousArray(self, arr, target):
		runningSumDict = dict()
		count = 0
		runningSumDict[0] = 1
		runningSum = 0
		for i in arr:
			runningSum += i
			compliment = runningSum - target
			if compliment in runningSumDict:
				count += runningSumDict[compliment]
			if runningSum not in runningSumDict:
				runningSumDict[runningSum] = 0
			runningSumDict[runningSum] += 1
		return count

if __name__ == '__main__':
	nums = [23, 2, 4, 6, 7, 3, 3]
	k = 6
	p1 = Problem_1()
	print(p1.findContinuousArray(nums, k))