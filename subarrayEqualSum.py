# // Time Complexity : O(n) for trsversal
# // Space Complexity :O(n) for for hashmap of running sum 
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : Was confused about complement and counter increase. Also tried frequency map seprately.


# // Your code here along with comments explaining your approach
# We need a consecutive subarray which adds up to k. We use |cmp - rSum| = k
# we need a running sum, a hashmap of frequencies of running sums, and every time it occurs we add the occurance times to counter.


class Solution:
    def subarraySum(self, nums: list[int], k:int) -> int:
        rsMap = {}                  # initialize a hashmap which stores the running sum of all elements in the array
        rSum = 0                    # counter for Running Sum
        rsMap[0] = 1                # edge condition
        count = 0                   # number of sub-arrays
        for i in range(len(nums)):
            rSum += nums[i]         # generate running sum
            
            #We need to find the complement first
            cmp = rSum - k          # Find complement 
            if cmp in rsMap:        # if complement has already happened in hashmap/is there previously a subarray? 
                count += rsMap[cmp] # increase counter by no of occurances 

            #after counter is incremented we can see frequency increment for next occurance(frequency map)
            if rSum in rsMap:       # if rsum is present
                rsMap[rSum] += 1    # increment freq
            else:                   
                rsMap[rSum] = 1     # add to freq map 
                   
        return count


arr   =  [ 3, 4, 7, 2,-3, 1, 4, 2, 0, 1]
#rsum = 0[ 3, 7,14,16,13,14,18,20,20,21] 
#cmp  = 0[-4, 0, 7, 9, 6, 7,11,13,13,14]
#y/n  = 0[ 0, 1, 1, 0, 0, 1, 0, 1, 1, 1] 
#rsMap= {0:1,3:1,7:1,14:2,16:1,13:1,14:2,18:1,20;2,21:1}
print(Solution().subarraySum(arr,7))

            
    
