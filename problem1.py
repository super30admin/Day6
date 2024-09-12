class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        #Time O(n)
        #Space O(n), space for store
        
        store=dict()
        count=0
        store[0]=1
        sum1=0
        
        for i in range(len(nums)):
            sum1+=nums[i]
            if sum1-k in store:
                count+=store[sum1-k]
            if sum1 not in store:
                store[sum1]=1
            else:
                store[sum1]+=1
            
        return count
                
        
