# Number of occurences Subarray sum equal to k -560. Passed all test cases.
#Time complexity =O(N)
#space complexity =O(N)
# Approach : First we calculate the running sum of each element and at the same time we calculate the compliment sum i.e (run_sum-k) if compliment sum is present in hash map then we count the occurence as count by value of compliment sum. In the end we check rnning_sum present in hash map or not.




class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        hashmap={0:1}
        count=0 
        cum_sum=0 
        for i in nums:
            cum_sum=cum_sum+i # cumulative sum
            
            if (cum_sum-k) in hashmap: #compliment sum checking
                count=hashmap[cum_sum-k]+count 
            if cum_sum in hashmap:
                hashmap[cum_sum]+=1
            else:
                hashmap[cum_sum]=1
                
            
        return count
            