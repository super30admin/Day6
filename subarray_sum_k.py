#time complexity: O(n)
#space complexity: O(n)

class Solution:
    def subarraySum(self, nums, k):
        self.nums=nums
        self.running_sum=0
        self.count=0
        hashmap={}
        hashmap[0]=1
        
        for i in range(len(nums)):
            self.running_sum=self.running_sum+nums[i]
            
            if self.running_sum-k in hashmap.keys():
                self.count=self.count+hashmap[self.running_sum-k]
                
            if self.running_sum in hashmap.keys():
                hashmap[self.running_sum]=hashmap[self.running_sum]+1
            else:
                hashmap[self.running_sum]=1
                
        return self.count
            