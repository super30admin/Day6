#Reference Video: https://youtu.be/TSAN_SSAsos
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        d = {}
        subarray, count = 0, 0
        
        for i in range(len(nums)):
            #Add 1 if we encounter 1
            if nums[i] == 1:
                count += 1
            #Add -1 if we encounter 0
            else:
                count += -1
            #if count is zero at the end, it means equal number of 1s and 0s
            if count == 0:
                subarray = i+1
            #check if the value of count exists in the dic if not 0
            #take the maximum value of subarray and length of next occurence 
            if count in d:
                subarray = max(subarray, i - d[count])
            #if the value of count does not exist, add to the dictionary
            else:
                d[count] = i
        return subarray