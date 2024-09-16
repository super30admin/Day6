class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        '''
        
        Time Complexity- O(N)
        Space Complexity - O(N)
        '''
        
        if nums == None:
            return 0
        
        count=0 # For storing the times sub array sum equals k
        curr_sum=0 # For maintaining the current sum
        kmap={} # Dictionary to store the current or running sum as key and number of times it occured as value
        
        for i in range(len(nums)):
            
            curr_sum+=nums[i] # Calculating the running sum
            if curr_sum==k:  # In forward pass, if we get running sum equal to k, we increment the count by 1
                count+=1
            
            if((curr_sum-k) in kmap): #[3,4,0,0,0,7] Forward will calculate 3 + 4 + 0 + 0 + 0 + 7 but 
                                      #for 0+0+7 count should also be increased
                count+=kmap[curr_sum-k]
                
            if curr_sum in kmap: # Initializing the current sum in the dictionary and if already present, 
                                 #increment the value by 1
                kmap[curr_sum]+=1
            else:
                kmap[curr_sum]=1
                
        return count
            
                
        return count