'''#Brute force sol:
#Time comp-O(n**2)
#space comp-O(1)
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        res=0
        for i in range(0,len(nums)):
            c1=0
            c0=0
            for j in range(i,len(nums)):
                if nums[j]==0:
                    c0=c0+1
                else:
                    c1=c1+1
                if c1==c0:
                    res=max(res,c0+c1)
        return res'''
#Time comp-O(n) only iterating through the array once
#space comp-O(k) length of key value pairs stored in dictionary 
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        res=0
        d={0:-1}
        #store in dict:{running sum,index}
        running_sum=0 # zero sum at -1 place
        for i in range(0,len(nums)):
            #if we find 1 then +1 if 0 then -1
            if nums[i]==0:
                running_sum=running_sum-1
            else:
                running_sum=running_sum+1  
            #check if this sum does not exist in the d:
            if running_sum not in d:
                d[running_sum]=i
            else:
                res=max(res,i-d[running_sum])
            #print(d)
           
        return res
