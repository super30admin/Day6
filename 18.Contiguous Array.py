class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        if nums is None or len(nums) == 0:
            return False

        count,maximum = 0,0
        D = {0: -1}

        for x in range(0,len(nums)):
            if nums[x] == 0:
                count -= 1
            else:
                count += 1

            if count in D.keys():
                maximum = max(maximum,x - D[count])
            else:
                D[count] = x
        return maximum