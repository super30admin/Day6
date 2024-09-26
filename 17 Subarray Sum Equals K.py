class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        if nums is None or nums == 0:
            return False
        count, rSum = 0, 0
        D = {0: 1}

        for x in range(len(nums)):
            rSum += nums[x]
            if (rSum - k) in D.keys():
                count += D[rSum - k]

            if rSum in D.keys():
                D[rSum] = D.get(rSum) + 1
            else:
                D[rSum] = 1

        return count
