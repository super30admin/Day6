class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        hashmap = dict()
        list = []
        max = 0
        sum = 0
        diff = 0
        hashmap[0] = -1
        for i in range(len(nums)):
            if(nums[i]==1):
                sum = sum + 1
            else:
                sum = sum -1
            if(hashmap.get(sum) is not None):
                diff = i - hashmap.get(sum)
                if(diff>max):
                    max = diff
            else:
                hashmap[sum] = i
        return max