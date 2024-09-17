class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        if len(nums) == 1:
            if nums[0] != k:
                return 0
            else:
                return 1
        add, hashmap = 0, {0: 1}
        counter = 0
        for num in nums:
            add = num + add
            if hashmap.get(add - k) is not None:
                counter = counter + hashmap.get(add - k)

            if hashmap.get(add) is None:
                hashmap[add] = 1
            else:
                hashmap[add] = hashmap[add] + 1

        return counter

