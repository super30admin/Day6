class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        if nums == None or len(nums) == 0:
            return 0

        map = {}
        rsum = 0
        count = 0

        map[0] = 1

        for i in range(len(nums)):
            rsum = rsum + nums[i]
            diff = rsum - k

            if diff in map:
                count = count + map[diff]
            if rsum in map:
                map[rsum] = map[rsum] + 1
            else:
                map[rsum] = 1    

        return count            


        