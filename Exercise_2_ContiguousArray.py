# Time Complexity :
# O(N) 


# Space Complexity :  
# O(N)

# Approach:
# We use a approach based on finding runningSum at each element in the array and utilizing the fact that
# if we see same runningSum in future, then the array between first occurewnce of that runningSum and current index will
# have same number of 0s and 1s.
# Create a HashMap to store key(runningSum) and values(first occurence index of that running sum).
# While iterating the array, if we encounter similar runningSum as already present in hashMap
# then, we can say that the subarray between the first occurence index and current index will be new maximum lenght.
# We continue to update the hashMap and maxCount(for lenght of longest contiguous subarray) and return the maxCount

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        if nums is None or len(nums)==0:
            return 0
        
        # running sum
        rSum = 0

        # the lenght of max contiguos subarray we want
        maxCount = 0

        # hashMap to store key(rSum) and value(index at which rSum first appeared)
        hashMap = {rSum:-1}

        # # base case
        # hashMap[rSum] = -1

        for i in range(0, len(nums)):
            # update rSum according to element 0 or 1
            if nums[i] == 1:
                rSum = rSum + 1
            else:
                rSum = rSum - 1
            
            # update the hashMap according to current rSum
            if rSum in hashMap.keys():
                maxCount = max(maxCount, i-hashMap[rSum])
            else:
                hashMap[rSum] = i

        
        return maxCount
        