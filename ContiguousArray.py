# Time Complexity : O(N) //As it would run N number of time the elemets present in array
#  Space Complexity : O(N) //It would run for N element present in array
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : N/A

#  Your code here along with comments explaining your approach

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        
        #For empty case
        if not nums:
            return 0
        
        hashMap ={}
        hashMap[0] = -1 #Add initial dummy value for cases like [0,1]
        rSum = 0
        maxVal = 0
        #Run a loop over nums length, if the value is 1 the increment rSum else decrement
        for i in range(len(nums)):
            
            if nums[i] == 1:
                rSum = rSum + 1
            else:
                rSum = rSum - 1
            #Add it to the hashMap and assign the max value between maxVal and the difference between the repeated values count with current loop index else assign the current index in hashmap   
            if rSum in hashMap:
                maxVal = max(maxVal,i - hashMap[rSum])
            else:
                hashMap[rSum] = i
        return maxVal