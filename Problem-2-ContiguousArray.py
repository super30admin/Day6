class Solution:
    def findMaxLength(self, nums) :
        hashmap = {}
        hashmap[0] = -1
        rSum = 0
        maxLEN = 0

        for i in range(len(nums)):
            if nums[i] == 0:
                rSum -= 1
            else:
                rSum += 1
            if rSum not in hashmap.keys():
                hashmap[rSum] = i

            else:

                curr = i - hashmap[rSum]
                maxLEN = max(curr, maxLEN)
        return maxLEN

sol=Solution()
arr = [0,0,1,1,0,1]
print (sol.findMaxLength(arr))


