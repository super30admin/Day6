class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        result = 0
        run_sum = 0
        dict1 = {0: 1}

        for n in nums:
            run_sum += n

            if run_sum - k in dict1:
                result += dict1[run_sum - k]

            if run_sum in dict1:
                dict1[run_sum] += 1
            else:
                dict1[run_sum] = 1
        return result