#time complexity: O(n)->where n is the size of nums 
## Problem1 (https://leetcode.com/problems/subarray-sum-equals-k/)
#python solution accepted

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        aux_dict = {0:1} #initialzing the dict
        
        count = 0
        s = 0
        
        for num in nums: #looping through nums
            s+=num #follwing an addition of the numbers
            if s-k in aux_dict: #if differe is in dictionary
                count+=aux_dict[s-k]
            if s in aux_dict:
                aux_dict[s]+=1
            else:
                aux_dict[s]=1
        return count #return final count