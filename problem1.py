#Subarray sums equal K

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        prefixsum = 0 #prefix sum
        count = 0
        aux = {0:1} #initializing edge case for dictionary 
        
        for num in nums:
            prefixsum+=num
            if prefixsum-k in aux:
                count+= aux[prefixsum-k]
            if prefixsum in aux:
                aux[prefixsum]+=1
            else:
                aux[prefixsum]=1
        return count