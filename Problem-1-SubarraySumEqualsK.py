class Solution:
    def subarraySum(self, nums, k) :
        hashmap = {}
        hashmap[0] = 1
        count = 0
        rSum = 0

        for i in range(len(nums)):
            rSum = rSum + nums[i]

            if (rSum - k) in hashmap.keys():
                count = count + hashmap[rSum - k]

            if rSum in hashmap.keys():

                hashmap[rSum] = hashmap[rSum] + 1
            else:
                hashmap[rSum] = 1
        return count
sol=Solution()
s= [1,2,3,4,5,10,12,14]
print (sol.subarraySum(s,9))