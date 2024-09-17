class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        if len(nums) == 2:
            if len(set(nums)) == 2:
                return 2
            else:
                return 0
        maxlength, add, hashmap = 0, 0, {0: -1}
        for index, num in enumerate(nums):
            if num == 0:
                add += -1
            else:
                add += 1

            if hashmap.get(add) is not None:
                maxlength = max(index - hashmap[add], maxlength)
            else:
                hashmap[add] = index

        return (maxlength)
