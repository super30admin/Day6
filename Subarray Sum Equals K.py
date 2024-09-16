# time complexity is o(n), where 'n' is the size of the input
# space complexity is o(n), where 'n' is the size of the input
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        count = 0
        resum = 0
        d = {0 : 1}
        for i in nums:
            resum += i
            if(resum - k in d):
                count += d[resum - k]
            if(resum not in d):
                d[resum] = 1
            else:
                d[resum] += 1
        return count
        