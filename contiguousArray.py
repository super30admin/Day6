'''
Time complexity :O(N)
Space complexity: O(1)
'''

class Solution:
    def findMaxLength(self, nums) -> int:

        if not nums:
            return 0

        rsum =0
        maxlen = 0
        hashMap = {0:-1}

        for i in range(len(nums)):
            rsum = rsum + 1 if nums[i]== 1 else -1

            if rsum not in hashMap:
                hashMap[rsum] = i
            else:

                maxlen = max(maxlen,i - hashMap[rsum])

        return maxlen

s = Solution()
print(s.findMaxLength([0,1,0]))