# Tc: O(n)
# Sc: O(n)

class Solution:
    def subarraySum(self, nums, k: int) -> int:
        
        rsum_dic = {0:1} # key->Rsums, value->freq
        rsum = 0
        res = 0
        for n in nums:
            rsum += n
            diff = rsum - k
            if diff in rsum_dic:
                res += rsum_dic[diff]
            if rsum not in rsum_dic:
                rsum_dic[rsum] = 1
            else:
                rsum_dic[rsum] += 1
        return res

obj = Solution()
print(obj.subarraySum([1,2,3],3))