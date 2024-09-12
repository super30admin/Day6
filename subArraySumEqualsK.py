def subarraySum(nums, k):
#brute force approach for sub arry sum equals k. 
#O(n^3) time complexity


   n = len(nums)
   count = 0
   for i in range(n):
      for j in range(i, n):
        sum = 0
        for k in range(i, j + 1):
             sum += nums[k]
        count += sum == k
   return count
print(subarraySum([1,1,1], 2))
