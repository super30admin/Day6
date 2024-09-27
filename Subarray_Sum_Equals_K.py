from typing import List
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        sub_map={0:1}
        cumulative_sum=0  #calculate cumulative sum
        counter=0         #count number of subarray
        for number in nums:
            cumulative_sum+=number

            if cumulative_sum-k in sub_map:
                counter+=sub_map[cumulative_sum-k]

            if cumulative_sum in sub_map:
                sub_map[cumulative_sum]+=1
            else:
                sub_map[cumulative_sum]=1

        return counter

s=Solution()
print(s.subarraySum([1,1,1], 2))