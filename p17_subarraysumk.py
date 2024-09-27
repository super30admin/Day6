"""
https://leetcode.com/problems/subarray-sum-equals-k/
Given an array of integers nums and an integer k, return the total number of continuous subarrays whose sum equals to k.
Approach: We maintain the running sum and check in the hashmap how many times the running sum has happened before
We will check if running sum has happened before or not if it has not happened before and the that running sum minus target
is not equal to target then we will just put the running sum in the hashmap else we will just increase the count and also incremennt the value
of running sum in hashmap if the number -target has happened before.
Tc:O(n)
Sc:O(n)
"""

class Solution:
    def subarraySum(self, nums, k: int) -> int:
        if nums==None or len(nums)==0:
            return 0
        count=0
        runningSum=0
        hashmap=dict()
        hashmap[0]=1
        for i in range(len(nums)):
            runningSum+=nums[i]
            if runningSum-k in hashmap.keys():
                ##if runningsum-k has happened before then in betwen the complement and the currentindex, the sum is =k
                count=count+hashmap[runningSum-k]
                # count+=1
                # hashmap[runningSum]+=1
            if not runningSum in hashmap.keys():
                hashmap[runningSum]=1
            else:
                hashmap[runningSum]=hashmap[runningSum]+1


        return count

nums = [1,2, 3]
k = 3
solve=Solution()
print(solve.subarraySum(nums,k))