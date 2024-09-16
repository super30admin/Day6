'''

Any difficulties : Yes, what to hash and how hash is useful
Did it run on leetcode: TLE
Time Complexity: 0(n2)
Space Complexity: 0(n)

Algorithm:

1. Created a list called sums where sums[i] denotes sum of all elements from
nums[0]+ nums[1]+nums[2].... +nums[i]

So, sum of all elements nums[i]+..+nums[j] = sums[j]-sums[i-1]

2. Then we traverse all the subarrays using two for loops and check where sums[j]-sums[i-1] becomes k.
if its equal to k then we increase the count.

This approach will give you TLE
'''



class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        count = 0
        sums = [0]*len(nums)
        sums[0] = nums[0]
        for i in range(1,len(nums)):
          sums[i] = sums[i-1]+nums[i]
        
        for i in range(len(nums)):
          if sums[i]==k:
            count+=1
        
        for i in range(1,len(nums)):
          for j in range(i,len(nums)):
            if sums[j]-sums[i-1]==k:
              count+=1
        
        return count


'''

Any difficulties : Yes, what to hash and how hash is useful
Did it run on leetcode: TLE
Time Complexity: 0(n)
Space Complexity: 0(n)

Algorithm:

1. Loop out the all the values in nums. and use a currsum variable where you will be adding
elements of nums if the currsum equals `k` then you add it to our count.

2. If the sum is not equal to k, then we check with how much it is more than k by currsum-k. 

2. Then we traverse all the subarrays using two for loops and check where sums[j]-sums[i-1] becomes k.
if its equal to k then we increase the count.

This approach will give you TLE
'''



from collections import defaultdict

class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        
        frequency = defaultdict(lambda:0)
        currentSum = 0
        count=0
        
        for num in nums:
            currentSum += num
            if currentSum==k:
                count+=1
            
            if frequency[currentSum-k]!=0:
                count+=frequency[currentSum-k]
            
            frequency[currentSum]=1+frequency[currentSum]
        
        return count