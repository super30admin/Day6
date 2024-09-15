# Time complexity : O(n)
# Space complexity : O(n) where n is the unique numbers that we get in the list
# Leetcode: Solved and submitted

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
      
        # declaring a Hashmap to keep track of the elements seen so far
        rcount = {}
        
        rSum = 0
        
        # This value is put, so that the complement of the number with k is the value 0, which is what we have encountered considering the first element.
        rcount[0] = 1
        res = 0
        for i in range(len(nums)):
            # find the running sum
            rSum += nums[i]
            
            # calculate the comlement of the sum with k, then look for the value in the Hashmap, if found, 
            # then update the result with the count of the value in the hashmap
            nu = rSum - k
            
            if nu in rcount:
                res += rcount[nu]
            
            # Here we update the hashmap if the running sum has been encountered, to ease the count of the final result, if not found, then put 0, else
            # increment the value by 1, and then finally returen the result
            if rSum not in rcount:
                rcount[rSum] = 0
            rcount[rSum] = rcount.get(rSum,0) + 1
            
        return res
