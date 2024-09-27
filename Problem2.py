#Approach :
# 1. Calculate the running Sum and append the values at each index into an array
# 2. Intialise a hashMap with {0:-1} since intial max is 0 at -1 position(since start of the array is 0 the position before that is -1)
# 3. For each element in rSum, if the value is already present in the Hashmap that mean there are equal number of 1s and 0s from the current index position - value of the key 
# 4. If the difference is greater than the max, then that will be the new max
#Time Complexity : O(n)
#Space Complexity :O(n)

class Solution(object):
    def findMaxLength(self, nums):
        cur_sum = 0
        cur_max = 0
        rSum = []
        myMap = {}
        myMap[0]=-1
    
        for i in nums :
            if(i==0):
                val =-1
                cur_sum = cur_sum +val
                rSum.append(cur_sum)
            else:
                val = 1
                cur_sum = cur_sum + val
                rSum.append(cur_sum)
        print(rSum)
        for i in range(0,len(rSum)):
            if(myMap.has_key(rSum[i])):
                temp = i - myMap.get(rSum[i]) 
                if(temp>cur_max):
                    cur_max = temp
            else:
                myMap[rSum[i]] = i
        
        return cur_max
        
        
        
        
        
        
        
        
        """
        :type nums: List[int]
        :rtype: int
        """
        
