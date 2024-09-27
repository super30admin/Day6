#Approach :
# 1. Calculate the running Sum
# 2. if runningSum - k exits in Hashmap, add get(rSum-k) +1 to the counter
# 3. If running sum exits adding one to the value or else add running sum to the hashmap
# 4. return counter

#Time Complexity : O(n)
#Space Complexity : O(n)

class Solution(object):
    def subarraySum(self, nums, k):
        sum =0
        rSum = []
        index = -1
        cur = 0
        counter =0
        myMap ={0:1}
        for i in nums :
            sum = sum +i
            rSum.append(sum)
        print rSum
        for i in rSum:
            if(myMap.has_key(i-k)):
                counter = counter + myMap.get(i-k)
            if(myMap.has_key(i)):
                myMap[i] = myMap.get(i) +1 
            if(myMap.has_key(i) is not True):
                myMap[i] = 1
                
        return counter 
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        
