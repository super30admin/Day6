#time complexity:O(n) bec you have to iterate over all the numbers
#space complexity:O(n) at max we might have to store at all indices
#passed all cases on LeetCode:yes
#difficulty faced:
# comments:in the code
#https://leetcode.com/problems/contiguous-array

class Solution:
    def findMaxLength(self, nums: 'List[int]') -> int:
        
        #map of running sum and index where the rsum occurs
        map1 = {}
        #have to store that we began with rsum 0 at idx -1 to avoid cases like [1,0] or [1,0,1,0]
        map1[0] = -1
        run_sum = 0
        lenn = 0
        
        for i in range(0,len(nums)):
            if nums[i] == 1:
                run_sum += 1
            #array only has 1s and 0s so this is a 0 case
            else:
                run_sum -= 1
            if run_sum in map1:
                #if running sum is present in the map then we dont add anything to the map but update the max len if it is greater than current length, logic here is that we will always find a contiguous subarray in between 2 values which are equal
                lenn = max(lenn, i - map1[run_sum])
            else:
                #if we encounter rsum for 1st time, we update the array
                map1[run_sum] = i 
        return lenn
                
            