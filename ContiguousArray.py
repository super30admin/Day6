class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        #checking if the length of the array is of length 1, given that length is great than equal to 1
        if len(nums)==1:
            return 0
        
        max_len = 0
        rsum = 0
        
        running_sum = {0:-1}
        
        for i,x in enumerate(nums):
            #updating rsum
            if x == 0:
                rsum-=1
          #      print("1st if")
            else:
                rsum+=1
           #     print("2nd if")
           # print(x,rsum,max_len)
            
            #checking if the value is present in array
            if rsum in running_sum:
            #    print("1-1st if ",max_len,i,running_sum[rsum])
                max_len = max(max_len, i - running_sum[rsum])
                
            else:
                
                running_sum[rsum] = i
           #     print("1-2nd if ",max_len,i,running_sum[rsum])
        
        
        return max_len
    
    #complexity O(n)
    #rsum method