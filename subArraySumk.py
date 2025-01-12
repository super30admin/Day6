class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        Map = {0: 1}
        rsum = 0
        count = 0
        for i in nums:
            rsum += i
            if (rsum - k) in Map:
                count += Map[rsum-k]
            if rsum not in Map:
                Map[rsum] = 1
            else:
                Map[rsum] = Map[rsum] + 1
        return count


        