'''
Time Complexity: O(N)
Space Complexity: O(N) //At worst case
'''
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        rsum = 0
        hashmap = {0:-1}
        op = 0
        for i in range(len(nums)):
            if(nums[i]==1):
                rsum +=1
            else:
                rsum -=1
            if(rsum in hashmap):
                temp = i-hashmap[rsum]
                if(temp>op):
                    op = temp
            else:
                hashmap[rsum] = i
        #print(hashmap)
        return op
        