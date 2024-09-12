## Space complexity : O(n)
## Time COmplecity: O(n)

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        res = 0
        sum_ = 0

        temp ={0:1}


        for num in nums:
            sum_ += num
            diff = sum_ - k
            res += temp.get(diff,0)
            temp[sum_] = 1 + temp.get(sum_,0)


        return res
