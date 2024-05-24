# Time Complexity
# O(N)
# Space Complexity
# O(n)

# Approach :

# Using running sum of the array elements to store in hashmap
# initialize hashmap and add 0:-1 KV pair
# traverse the array, and calculate the rsum at each index
# check if the rsum exits in the hashmap, if not add it in the hashmap along with its index
# if it exists, calculate the maximum length of the rsum at that index wrt to the first index occurence of that rsum
# if the length is more, update the length

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:

        if not nums:
            return -1

        sumArr = 0
        maxLen = 0
        hashMapArr = {}
        hashMapArr[0] = -1

        for i in range(len(nums)):

            if (nums[i] == 0):
                sumArr = sumArr-1
            else:
                sumArr = sumArr+1

            if sumArr not in hashMapArr:
                hashMapArr[sumArr] = i
            else:
                maxLen = max(maxLen, i-hashMapArr[sumArr])

        return maxLen
