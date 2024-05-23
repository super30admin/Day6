# Time Complexity
# O(N)
# Space Complexity
# O(n)

# Approach :

# Using running sum of the array elements to store in hashmap
# initialize hashmap and add 0:1 KV pair
# calculate runnning sum with each element
# one condition is that if rsum - k element is present
# if so, increment the count of the subarrays found
# if not, store the rsum at that index in the hashmap
# if a component already exists, increment by 1 else add 1 .

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        if not nums:
            return -1
        hashMap = {}
        sumArr = 0
        countArr = 0
        hashMap[0] = 1
        for i in range(len(nums)):
            sumArr = sumArr + nums[i]
            if sumArr - k in hashMap:
                countArr = countArr + hashMap[sumArr - k]

            if sumArr not in hashMap:
                hashMap[sumArr] = 1
            else:
                hashMap[sumArr] = hashMap[sumArr]+1

        return countArr
