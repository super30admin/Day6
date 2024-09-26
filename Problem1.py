#Problem 1 : https://leetcode.com/problems/subarray-sum-equals-k/
#Test Cases Passed on LeetCode
#Space Complexity-O(n)
#Time Complexity-O(n)

class Solution:
    def subarraySum(self, nums, k):
        #dictionary storing sum and its occurence
        sumdict = {0:1}
        n = len(nums)
        count = 0
        s = 0

        for num in nums:
            s += num
            #finding s-k since s+s-k=k ,
            #if it is present in dictionary,we need to update the count
            if s-k in sumdict:
                count += sumdict[s-k]
            #if current sum is already in dictionary,
            #we need to update the no of occurences of it in dictionary
            if s in sumdict:
                sumdict[s]+=1
            else:
                #otherwise add the sum in the dictionary with occurence =1
                sumdict[s]=1
        return count
sol=Solution()
nums=[3,4,7,2,-3,1,4,2]
print(sol.subarraySum(nums,7))
