class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        if(len(nums)==0):
            return 0
        hashmap = dict()
        sum = 0
        count = 0
        hashmap[0] = 1
        for i in range(len(nums)):
            sum = sum + nums[i]
            if(hashmap.get(sum-k) is not None):
                count = count + hashmap[sum-k]   
            if(hashmap.get(sum) is not None):
                hashmap[sum] = hashmap[sum] + 1
            else:
                hashmap[sum] = 1           
                            
        return count