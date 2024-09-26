class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        '''
        Algo : https://www.youtube.com/watch?v=9ZyLjjk536U
        from 6:04 to 11:00
        T = O(N)
        S = O(N)
        '''
        max_length =0
        hash={}
        count=0
        for i in range(len(nums)):
            current=nums[i]
            if current==0:
                count-=1 # decrement our count if our current element is 0
            else:
                # increment our count if current element is 1
                count+=1

            if count==0:
                # if count is 0, we have a new subarray with length+1
                max_length=i+1
            if count in hash:
                max_length=max(max_length,i-hash[count]) 
            else:
                hash[count]=i
        return max_length   
        
        

    def BruteForcefindMaxLength(self, arr: List[int]) -> int:  
        '''
        Run a loop from i=0 to n-2
          if(arr[i]==1)
          sum=1
          else
          sum=-1
          Run inner loop from j=i+1 to n-1
              sum+=arr[j]
              if(sum==0)
                if(j-i+1>max_size)
                   start_index=i
                   max_size=j-i+1
        Run a loop from i=start_index till max_size-1
        print(arr[i])
        T = O(N^2)
        S = O(1)
        '''
        sum = 0
        maxsize = 0
        n = len(arr)
        # Pick a starting point as i

        for i in range(0, n-1):

            sum = -1 if(arr[i] == 0) else 1

            # Consider all subarrays starting from i

            for j in range(i + 1, n):

                sum = sum + (-1) if (arr[j] == 0) else sum + 1

                # If this is a 0 sum subarray, then
                # compare it with maximum size subarray
                # calculated so far

                if (sum == 0 and maxsize < j-i + 1):

                    maxsize = j - i + 1
        return maxsize

                
                
                
                
    
