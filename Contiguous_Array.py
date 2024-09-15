class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        if not nums:
            return 0
        maxlength, count, length = 0, 0, 0
        smap = {0: -1}
        for i in range(len(nums)):
            if (nums[i] == 1):
                count += 1
            else:
                count -= 1
            if count in smap:
                length = i - smap[count]
                print(length)
            else:
                smap[count] = i

            maxlength = max(maxlength, length)

        return maxlength
