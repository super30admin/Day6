from collections import defaultdict
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        dict_val = defaultdict(int)
        
        sum_curr = 0
        # sum_curr_set   = set()
        # sum_curr_set.add(0)
        ans = 0
        dict_val[0] = 1
        for val in nums:
            sum_curr+=val
            # print(sum_curr)
            if sum_curr-k in dict_val:
                ans+=dict_val[sum_curr-k]
            dict_val[sum_curr]+=1
        return ans