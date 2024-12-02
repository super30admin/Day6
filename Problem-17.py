# Contigous Array -525
#Time complexity -O(N)
#Space complexity -O(N)
#Approach = Here we need to keep track of running_sum and maximum length. In hashmap we store values of running_sum and index of each sum. If running_sum already present in hash_map then we need to take max value of max_length, difference of index and value of curr_sum, else we put in hash_map.
#Passes all test cases
   

class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        
        hash_map={}
        cur_sum=0
        max_len=0
        hash_map[0]=-1 #edge case
        for i in range(len(nums)):
            if nums[i]==0:
                cur_sum+=(-1)
            else:
                cur_sum+=1
            if cur_sum in hash_map:
                max_len=max(max_len,(i-hash_map[cur_sum])) # (current index-value of curr_sum)
            else:
                hash_map[cur_sum]=i
        return max_len