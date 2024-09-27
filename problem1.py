'''#Brute force
#time comp- O(n**2)
#space comp-O(1)
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        res=0
        for i in range(0,len(nums)):
            curr_sum=0
            for j in range(i,len(nums)):
                curr_sum=curr_sum+nums[j]
                if curr_sum==k:
                    res=res+1 # to take count so far
        return res'''
#time comp- O(n) #only traversing once 
#space comp-O(k) length of key value pairs
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        r_sum=0
        count=0
        d={0:1}
        for i in range(0,len(nums)):
            r_sum=r_sum+nums[i]
            if r_sum-k in d:
                count=count+d[r_sum-k]
            if r_sum not in d:
                d[r_sum]=1
            else:
                d[r_sum]=d[r_sum]+1
            #print(d)
        return count
            
            
            
            
