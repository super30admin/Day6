class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        if len(nums)==1:
            if nums[0]==k:
                return 1
            else:
                return 0
        
        count = 0
        rsum = 0
        
        #initialize this for 0, as a complement of 7
        running_sum = {0:1}
        
        for i,x in enumerate(nums):
            
            rsum +=x 
            
            #checking if the complement value is present in array
            if (rsum-k) in running_sum:
                count+= running_sum[rsum-k]
               
            #checking if the current is present, if not we add
            if rsum in running_sum:
                running_sum[rsum] +=1
            else:
                running_sum[rsum] = 1
        
        return count

#rsum method
#time complexity O(n)
