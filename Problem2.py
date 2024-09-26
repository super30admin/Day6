#Problem 2 : https://leetcode.com/problems/contiguous-array/
#Test Cases Passed on LeetCode
#Space Complexity-O(n)
#Time Complexity-O(n)
class Solution:
    def findMaxLength(self, nums):
        counter = {}
        #For case such as [0,1], we would need initially sum be zero
        counter[0] = -1
        
        max_count = 0
        count = 0
        
        for i in range(0, len(nums)):
            #Add 1 in case of 1 and -1 n case of 0
            if nums[i] == 1: 
                count = count + 1
            else:
                count = count - 1
            #If the sum found already exists in dictionary then find the max count otherwise               #simple add in the dictionay
            #we need to check where the sum repeats
            if count in counter:
                max_count = max(max_count, i - counter[count])
            else:
                counter[count] = i

        return max_count

sol=Solution()
nums=[0,1,0,0,1,1,0,0,1]
output=sol.findMaxLength(nums)
print("Max length of array with equal numbers of 0s and 1s :")
print(output)










