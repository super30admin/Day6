class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        #initializing the hashmap
        hashmap=collections.defaultdict(int)
        maxi=0
        zero=0
        for i in range(len(nums)):
            #condition to check zeroes and ones
            if nums[i]==0:
                zero+=1
            else:
                zero-=1
            if zero==0:
                maxi=i+1
            #condition to check existence of keys in hashmap
            if(hashmap.get(zero)==None):
                hashmap[zero]=i   
            else:
                maxi1=i-(hashmap.get(zero))
                maxi=max(maxi,maxi1)      
        return maxi