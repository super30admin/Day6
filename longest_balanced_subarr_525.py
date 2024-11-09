class Solution:
    def findMaxLength(self, nums: List[int]) -> int:

        hashmap = {0: -1}
        count = 0
        ans = 0

        for i, num in enumerate(nums):
            count += 1 if num == 1 else -1

            if count in hashmap:
                ans = max(ans, i - hashmap[count])
            else:
                hashmap[count] = i

        return ans
