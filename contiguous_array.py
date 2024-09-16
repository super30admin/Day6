#time complexity: O(n)
#space complexity: O(n)

class Solution:
    def findMaxLength(self, nums):
        self.maximum=0
        self.nums=nums
        self.running_count=0
        hashmap={}
        hashmap[0]=-1
        for i in range(len(nums)):
            if nums[i]==0:
                self.running_count=self.running_count-1
            else:
                self.running_count=self.running_count+1
                
            if self.running_count not in hashmap.keys():
                hashmap[self.running_count]=i
            else:
                self.maximum=max(i-hashmap[self.running_count], self.maximum)
                
        return self.maximum